package racingcar.view;

public class OutputView {
    private static final OutputView outputView = new OutputView();

    private OutputView() {
    }

    public static OutputView getInstance() {
        return outputView;
    }

    public void getCarName() {
        System.out.println(OutputMessage.TYPE_CAR_NAME.getMessage());
    }

    public void getAttemptCount() {
        System.out.println(OutputMessage.ASK_ATTEMPT_COUNT.getMessage());
    }
}