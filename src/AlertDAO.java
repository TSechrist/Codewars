import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

interface AlertDAO {

    final Map<UUID, Date> alerts = new HashMap<UUID, Date>();

    default UUID addAlert(Date time) {
        UUID id = UUID.randomUUID();
        this.alerts.put(id, time);
        return id;
    }

    default Date getAlert(UUID id) {
        return this.alerts.get(id);
    }

}

class AlertService {
    private final MapAlertDAO storage = new MapAlertDAO();
    private final AlertDAO alert;

    public AlertService(AlertDAO a){
        alert = a;
    }

    public UUID raiseAlert() {
        return this.alert.addAlert(new Date());
    }

    public Date getAlertTime(UUID id) {
        return this.alert.getAlert(id);
    }
}

class MapAlertDAO implements AlertDAO {
    private final Map<UUID, Date> alerts = new HashMap<UUID, Date>();

    public UUID addAlert(Date time) {
        UUID id = UUID.randomUUID();
        this.alerts.put(id, time);
        return id;
    }

    public Date getAlert(UUID id) {
        return this.alerts.get(id);
    }
}
