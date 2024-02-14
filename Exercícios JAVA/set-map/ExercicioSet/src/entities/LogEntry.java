package entities;

import java.util.Date;

public class LogEntry {

    private String userName;
    private Date momente;

    public LogEntry(String userName, Date momente) {
        this.userName = userName;
        this.momente = momente;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getMomente() {
        return momente;
    }

    public void setMomente(Date momente) {
        this.momente = momente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LogEntry logEntry)) return false;

        return getUserName().equals(logEntry.getUserName());
    }

    @Override
    public int hashCode() {
        return getUserName().hashCode();
    }


}
