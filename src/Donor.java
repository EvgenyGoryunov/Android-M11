public class Donor {

    private String surname;
    private String group;
    private boolean inTomsk;

    public Donor(String surname, String group, boolean inTomsk) {
        this.surname = surname;
        this.group = group;
        this.inTomsk = inTomsk;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public boolean isInTomsk() {
        return inTomsk;
    }

    public void setInTomsk(boolean inTomsk) {
        this.inTomsk = inTomsk;
    }

    @Override
    public String toString() {
        return "ФИО: " + surname + ", группа крови: " + group + ", житель Томска: " + inTomsk;
    }

}
