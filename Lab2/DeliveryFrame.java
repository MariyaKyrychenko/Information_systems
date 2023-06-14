import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeliveryFrame extends Frame implements ActionListener, Mediator {

    private InfoCheckbox checkDelivery;
    private InfoCheckbox checkSelfDelivery;
    private InfoCheckbox checkDateTime1;
    private InfoCheckbox checkDateTime2;
    private InfoTextField textName;
    private InfoTextField textNumber;
    private InfoButton buttonOk;
    private InfoButton buttonCancel;

    public DeliveryFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new GridLayout(5, 2));

        createInfo();
        add(checkDelivery);
        add(checkSelfDelivery);
        add(new Label("Name:"));
        add(textName);
        add(new Label("Number:"));
        add(textNumber);
        add(checkDateTime1);
        add(checkDateTime2);
        add(buttonOk);
        add(buttonCancel);
        infoChanged();

        pack();
        setVisible(true);
    }

    public void createInfo() {

        CheckboxGroup g = new CheckboxGroup();
        checkDelivery= new InfoCheckbox("Delivery", g, true);
        checkSelfDelivery = new InfoCheckbox("Self-delivery", g, false);
        textName = new InfoTextField("", 10);
        textNumber = new InfoTextField("", 10);
        CheckboxGroup g1 = new CheckboxGroup();
        checkDateTime1 = new InfoCheckbox("12/10/2020: 10.00-12.00", g1, true);
        checkDateTime2 = new InfoCheckbox("14/10/2020: 9.00-10.00", g1, false);
        buttonOk = new InfoButton("OK");
        buttonCancel = new InfoButton("Cancel");

        checkDelivery.setMediator(this);
        checkSelfDelivery.setMediator(this);
        textName.setMediator(this);
        textNumber.setMediator(this);
        checkDateTime1.setMediator(this);
        checkDateTime2.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);

        checkDelivery.addItemListener(checkDelivery);
        checkSelfDelivery.addItemListener(checkSelfDelivery);
        textName.addTextListener(textName);
        textNumber.addTextListener(textNumber);
        checkDateTime1.addItemListener(checkDateTime1);
        checkDateTime2.addItemListener(checkDateTime2);
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);
    }

    public void infoChanged() {
        if (checkDelivery.getState()) {
            // Delivery mode (Another Person)
            textName.setInfoEnabled(true);
            textNumber.setInfoEnabled(true);
            userNumberChanged();
            checkDateTime1.setInfoEnabled(true);
            checkDateTime2.setInfoEnabled(true);
            buttonOk.setInfoEnabled(true);
        } else {
            // Self-delivery mode
            textName.setInfoEnabled(false);
            textNumber.setInfoEnabled(false);
            checkDateTime1.setInfoEnabled(false);
            checkDateTime2.setInfoEnabled(false);
        }
    }

    private void userNumberChanged() {
        if (textName.getText().length() > 0) {
            textNumber.setInfoEnabled(true);
            if (textNumber.getText().length() > 0) {
                buttonOk.setInfoEnabled(true);
            } else {
                buttonOk.setInfoEnabled(false);
            }
        } else {
            textNumber.setInfoEnabled(false);
            buttonOk.setInfoEnabled(false);
        }
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }
}