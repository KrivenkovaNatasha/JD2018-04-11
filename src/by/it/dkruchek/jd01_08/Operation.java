package by.it.dkruchek.jd01_08;

/**
 * Created by Dmitriy.Kruchek on 5/4/2018.
 */
public interface Operation {

    Var add(Var other);

    Var sub(Var other);

    Var mul(Var other);

    Var div(Var other) throws ArithmeticException;

}
