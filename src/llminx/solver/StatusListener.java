package llminx.solver;

import java.util.EventListener;

/**
 *
 */
public interface StatusListener extends EventListener {

  void statusEvent(StatusEvent aEvent);

}
