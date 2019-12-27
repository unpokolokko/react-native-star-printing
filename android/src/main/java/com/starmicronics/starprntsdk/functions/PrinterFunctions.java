package com.starmicronics.starprntsdk.functions;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;

import com.starmicronics.starioextension.ICommandBuilder;
import com.starmicronics.starioextension.StarIoExt;
import com.starmicronics.starprntsdk.localizereceipts.ILocalizeReceipts;

import static com.starmicronics.starioextension.StarIoExt.Emulation;
import static com.starmicronics.starioextension.ICommandBuilder.CutPaperAction;
import static com.starmicronics.starioextension.ICommandBuilder.BlackMarkType;
import static com.starmicronics.starioextension.ICommandBuilder.BitmapConverterRotation;

public class PrinterFunctions {

    public static byte[] createTextReceiptData(Emulation emulation, ILocalizeReceipts localizeReceipts, boolean utf8) {
        ICommandBuilder builder = StarIoExt.createCommandBuilder(emulation);

        builder.beginDocument();

        localizeReceipts.appendTextReceiptData(builder, utf8);

        builder.appendCutPaper(CutPaperAction.PartialCutWithFeed);

        builder.endDocument();

        return builder.getCommands();
    }

    public static byte[] createRasterReceiptData(Emulation emulation, ILocalizeReceipts localizeReceipts, Resources resources) {
        ICommandBuilder builder = StarIoExt.createCommandBuilder(emulation);

        builder.beginDocument();

        Bitmap image = localizeReceipts.createRasterReceiptImage(resources);

        builder.appendBitmap(image, false);

        builder.appendCutPaper(CutPaperAction.PartialCutWithFeed);

        builder.endDocument();

        return builder.getCommands();
    }

    public static byte[] createScaleRasterReceiptData(Emulation emulation, ILocalizeReceipts localizeReceipts, Resources resources, int width, boolean bothScale) {
        ICommandBuilder builder = StarIoExt.createCommandBuilder(emulation);

        builder.beginDocument();

        Bitmap image = localizeReceipts.createScaleRasterReceiptImage(resources);

        builder.appendBitmap(image, false, width, bothScale);

        builder.appendCutPaper(CutPaperAction.PartialCutWithFeed);

        builder.endDocument();

        return builder.getCommands();
    }

    public static byte[] createCouponData(Emulation emulation, ILocalizeReceipts localizeReceipts, Resources resources, int width, ICommandBuilder.BitmapConverterRotation rotation) {
        ICommandBuilder builder = StarIoExt.createCommandBuilder(emulation);

        builder.beginDocument();

        Bitmap image = localizeReceipts.createCouponImage(resources);

        builder.appendBitmap(image, false, width, true, rotation);

        builder.appendCutPaper(CutPaperAction.PartialCutWithFeed);

        builder.endDocument();

        return builder.getCommands();
    }

    public static byte[] createRasterData(Emulation emulation, Bitmap bitmap, int width, boolean bothScale) {
        ICommandBuilder builder = StarIoExt.createCommandBuilder(emulation);

        builder.beginDocument();

        builder.appendBitmap(bitmap, true, width, bothScale);

        builder.appendCutPaper(CutPaperAction.PartialCutWithFeed);

        builder.endDocument();

        return builder.getCommands();
    }

    public static byte[] createTextBlackMarkData(Emulation emulation, ILocalizeReceipts localizeReceipts, BlackMarkType type, boolean utf8) {
        ICommandBuilder builder = StarIoExt.createCommandBuilder(emulation);

        builder.beginDocument();

        builder.appendBlackMark(type);

        localizeReceipts.appendTextLabelData(builder, utf8);

        builder.appendCutPaper(CutPaperAction.PartialCutWithFeed);

//      builder.appendBlackMark(BlackMarkType.Invalid);

        builder.endDocument();

        return builder.getCommands();
    }

    public static byte[] createPasteTextBlackMarkData(Emulation emulation, ILocalizeReceipts localizeReceipts, String pasteText, boolean doubleHeight, BlackMarkType type, boolean utf8) {
        ICommandBuilder builder = StarIoExt.createCommandBuilder(emulation);

        builder.beginDocument();

        builder.appendBlackMark(type);

        if (doubleHeight) {
            builder.appendMultipleHeight(2);

            localizeReceipts.appendPasteTextLabelData(builder, pasteText, utf8);

            builder.appendMultipleHeight(1);
        }
        else {
            localizeReceipts.appendPasteTextLabelData(builder, pasteText, utf8);
        }

        builder.appendCutPaper(CutPaperAction.PartialCutWithFeed);

//      builder.appendBlackMark(BlackMarkType.Invalid);

        builder.endDocument();

        return builder.getCommands();
    }

    public static byte[] createTextPageModeData(Emulation emulation, ILocalizeReceipts localizeReceipts, Rect rect, BitmapConverterRotation rotation, boolean utf8) {
        ICommandBuilder builder = StarIoExt.createCommandBuilder(emulation);

        builder.beginDocument();

        builder.beginPageMode(rect, rotation);

        localizeReceipts.appendTextLabelData(builder, utf8);

        builder.endPageMode();

        builder.appendCutPaper(CutPaperAction.PartialCutWithFeed);

        builder.endDocument();

        return builder.getCommands();
    }
}
