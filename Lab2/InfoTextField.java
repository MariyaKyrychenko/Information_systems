import java.awt.Color;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class InfoTextField extends TextField implements TextListener, Info {

    private Mediator mediator;

    public InfoTextField(String text, int columns) {
        super(text, columns);
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setInfoEnabled(boolean enabled) {
        setEnabled(enabled);
        setBackground(enabled ? Color.white : Color.lightGray);
    }

    public void textValueChanged(TextEvent e) {
        mediator.infoChanged();
    }
}