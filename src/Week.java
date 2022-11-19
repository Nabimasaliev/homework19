public enum Week {
    MONDAY("Дуйшөмбү куну жава окуйм"),
    TUESDAY("Шейшемби күнү англис тили сабагын окуйм"),
    WEDNESDAY("Шаршемби күнү talking club сабагын окуйм"),
    THURSDAY("Бейшенби күнү soft skills сабагын окуйм"),
    FRIDAY("Жума күнү event сабагы болот"),
    SATURDAY("Ишемби күнү кайтооло болот"),
    SUNDAY("Жекшемби күнү эс алам");

    private String information;

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    Week(String information) {
        this.information = information;
    }
}
