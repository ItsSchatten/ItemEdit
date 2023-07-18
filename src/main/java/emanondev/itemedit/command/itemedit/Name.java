package emanondev.itemedit.command.itemedit;

import emanondev.itemedit.command.ItemEditCommand;

public class Name extends Rename {
    public Name(ItemEditCommand cmd) {
        super("name", cmd);
    }
}
