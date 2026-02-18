package prac3.problem1;

public enum Diet {
    HERBIVORES ("plant eaters"), CARNIVORES ("meat eaters"), OMNIVORES ("both plan and meat eaters");

    private final String despription;
    private Diet(String despription) {
        this.despription = despription;
    }
    public String getDespription() {
        return despription;
    }
}
