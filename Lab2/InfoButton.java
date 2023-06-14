import java.awt.Button;

public class InfoButton extends Button implements Info {

    private Mediator mediator;

    public InfoButton(String caption) {
        super(caption);
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setInfoEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}