interface INotifier {
    void send(String message);
}

class EmailNotifier implements INotifier {
    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}

abstract class NotifierDecorator implements INotifier {
    protected final INotifier wrapped;

    public NotifierDecorator(INotifier wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void send(String message) {
        wrapped.send(message);
    }
}

class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(INotifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending SMS: " + message);
    }
}

class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(INotifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending Slack message: " + message);
    }
}

public class DecoratorPattern {
    public static void main(String[] args) {
        INotifier emailNotifier = new EmailNotifier();
        INotifier emailAndSMSNotifier = new SMSNotifierDecorator(emailNotifier);
        INotifier emailSMSAndSlackNotifier = new SlackNotifierDecorator(emailAndSMSNotifier);

        System.out.println("Sending via Email only:");
        emailNotifier.send("Hello via Email!");

        System.out.println("\nSending via Email and SMS:");
        emailAndSMSNotifier.send("Hello via Email and SMS!");

        System.out.println("\nSending via Email, SMS, and Slack:");
        emailSMSAndSlackNotifier.send("Hello via Email, SMS, and Slack!");
    }
}

