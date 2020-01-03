package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    private Character delimiter;
    private StringBuilder builder;

    public StringAssembler(Character delimiter) {
        this.delimiter = delimiter;
        builder = new StringBuilder();
    }

    public StringAssembler append(String str) {
        if(builder.length() > 0) {
            builder.append(delimiter);
        }
        builder.append(str);
        return this;
    }

    public String assemble() {
        return builder.toString();
    }
}
