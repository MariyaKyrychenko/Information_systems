import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class InfoCheckbox extends Checkbox implements ItemListener, Info {

    private Mediator mediator;

    public InfoCheckbox(String caption, CheckboxGroup group, boolean state) {
        super(caption, group, state);
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setInfoEnabled(boolean enabled) {
        setEnabled(enabled);
    }

    public void itemStateChanged(ItemEvent e) {
        mediator.infoChanged();
    }
}