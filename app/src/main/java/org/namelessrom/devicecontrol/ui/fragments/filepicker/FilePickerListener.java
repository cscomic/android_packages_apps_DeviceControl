package org.namelessrom.devicecontrol.ui.fragments.filepicker;

import org.namelessrom.devicecontrol.objects.FlashItem;

import java.io.File;

public interface FilePickerListener {
    public void onFilePicked(final File file);

    public void onFlashItemPicked(final FlashItem flashItem);
}
