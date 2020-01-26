package llminx.solver;

/**
 *
 */
public class StatusEvent {

  private final StatusEventType fType;
  private final String fMessage;
  private final double fProgress;

  public StatusEvent(StatusEventType type, String aMessage, double progress) {
    fType = type;
    fMessage = aMessage;
    fProgress = progress;
  }

  public StatusEventType getType() {
    return fType;
  }

  public String getMessage() {
    return fMessage;
  }

  public double getProgress() {
    return fProgress;
  }
}
