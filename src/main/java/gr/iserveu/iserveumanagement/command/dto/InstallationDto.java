package gr.iserveu.iserveumanagement.command.dto;

import gr.iserveu.iserveumanagement.command.base.OrderCommand;

public class InstallatioDto extends OrderCommand {
    private LiveDto live;
    private HardwareDto hardware;
    private SoftwareDto software;
}
