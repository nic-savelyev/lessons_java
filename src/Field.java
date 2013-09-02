
public class Field {

    private static final char DEFAULT_CEll_VALUE = ' ';

    private static final int DEFAULT_FIELD_SIZE = 3;

    private int fieldSize = 3;

    private final char[][] field;

    public Field() {
        this(DEFAULT_FIELD_SIZE);
        System.out.println("In constr1");
    }

    public Field(int size) {
        fieldSize = size;
        field = new char[fieldSize][fieldSize];
        System.out.println("In constr2");
    }

 /*   public void setFieldSize (int newFieldSize) {
        if (newFieldSize > MIN_FIELD_SIZE && newFieldSize < MAX_FiELD_SIZE) {
            fieldSize = newFieldSize;
        }
    }
   */
    public int getFieldSize () {
       return fieldSize;
    }

    public void eraseField() {
        for (int i = 0; i < fieldSize; i++) {
            eraseLine(i);
        }
    }

    public void showField() {
        System.out.println();
        for (int i = 0; i < fieldSize; i++) {
            showLine(i);
            System.out.println();
        }
    }

    private void eraseLine (int lineNumber) {
        for (int i = 0; i < fieldSize; i++) {
            field [i][lineNumber] = DEFAULT_CEll_VALUE;
        }
    }

    private void showLine(int lineNumber) {
        for (int i = 0; i < fieldSize; i++) {
            showCell(i, lineNumber);
        }
    }

    private void showCell(int x, int y) {
        System.out.print("[" + field[x][y] + "]");
    }

}
