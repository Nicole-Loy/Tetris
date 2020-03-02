
public enum Direction {
    DOWN(0, 1),
    LEFT(-1, 0),
    RIGHT(1, 0),
    UP(0, -1);

    int x, y;// ВВОЖУ ЦЕЛЫЕ ЧИСЛА ИНТ ОБОЗНАЧАЮ ПЕРЕМЕННЫЕ Х И У

    Direction(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Direction prev() {
        int nextIndex = ordinal() - 1;

        if (nextIndex == -1) {
            nextIndex = Direction.values().length - 1;
        }

        return Direction.values()[nextIndex];
    }

    public Direction next() {
        int nextIndex = ordinal() + 1;

        if (nextIndex == Direction.values().length) {
            nextIndex = 0;
        }

        return Direction.values()[nextIndex];
    }
}
