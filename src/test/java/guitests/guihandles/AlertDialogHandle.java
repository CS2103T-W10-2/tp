package guitests.guihandles;

import javafx.scene.control.DialogPane;
import javafx.stage.Stage;
import seedu.address.ui.UiManager;

// @@author pyokagan-reused
// Test code adapted from AddressBook Level 4 https://se-education.org/addressbook-level4/ with modifications
/**
 * A handle for the {@code AlertDialog} of the UI.
 */
public class AlertDialogHandle extends StageHandle {
    private final DialogPane dialogPane;

    /**
     * Constructor.
     *
     * @param stage The stage for JavaFX.
     */
    public AlertDialogHandle(Stage stage) {
        super(stage);

        dialogPane = getChildNode("#" + UiManager.ALERT_DIALOG_PANE_FIELD_ID);
    }

    /**
     * Returns the text of the header in the {@code AlertDialog}.
     */
    public String getHeaderText() {
        return dialogPane.getHeaderText();
    }

    /**
     * Returns the text of the content in the {@code AlertDialog}.
     */
    public String getContentText() {
        return dialogPane.getContentText();
    }
}
// @@author
