package p5.interf;

@FunctionalInterface
public interface Function {
void execute(String ...args) throws IllegalArgumentException;
}
