import lmszadachaPolimorfism.Animal;
import lmszadachaPolimorfism.Eagle;
import lmszadachaPolimorfism.Shark;
import lmszadachaPolimorfism.Turtle;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//  todo      Animal деген класс тузунуз жана бир метод кошунуз.
//           Анын 3 наследнигин тузунуз.Shark деген класска attack (), Turtle деген класска swim() жана Eagle деген класска
//           fly() методторун тузосуз.
//          Animal тибин колдонуп массив тузунуз жана ал жакка анын наследниктерин кошунуз.
//          instanceOf жана getClass () - ты колдонуп Animal массивиндеги жаныбарлардын оздорунун методдорун чыгарыныз.
//          Ар бир объект учун оз озунчо массив тузуп Animal массивиндеги жаныбарларды болуп оз озунун массивине
//          салыныз.
//        Создайте класс Animal с одним методом которые есть 3 наследника такие как
//        Shark, с методом attack (), Turtle с методом swim(), Eagle с методом fly().
//                Создайте массив используя Animal и положите туда всех наследников.
//        Используя instanceOf и getClass () вызовите свои методы животных из массива Animal.
//                Для каждого объекта по отдельности создайте массив и разделите животных из Animal massiva и положите
//        в свои массивы.


        Animal [] animals = {new Animal(),
                            new Eagle(),
                            new Turtle(),
                            new Shark()};

        for (Animal animalM : animals) {
        if(animalM instanceof Eagle eagle){
            eagle.fly();

        }

        else if(animalM instanceof Turtle turtle){
            turtle.swim();
        }

        else  if(animalM instanceof Shark shark){
            shark.attack();
        }
        else  if (animalM.getClass() == Animal.class){
            animalM.run();

        }
         Eagle  [] eagles = new Eagle[1];
         Turtle [] turtles = new Turtle[1];
         Shark  [] sharks = new Shark[1];
         Animal [] animals1 = new Animal[1];

        for (Animal animal : animals) {
            if (animal.getClass() == Eagle.class) {
                eagles[0] = (Eagle) animal;
            } else if (animal.getClass() == Turtle.class) {
                turtles[0] = (Turtle) animal;
            } else if (animal.getClass() == Shark.class) {
                sharks[0] = (Shark) animal;
            } else if (animal.getClass() == Animal.class) {
                animals1[0] = (Animal) animal;
            }


        }
            for (Eagle eagle : eagles) {
                eagle.fly();

            }

            for (Turtle turtle : turtles) {
                turtle.swim();

            }
            for (Shark shark : sharks) {
                shark.attack();

            }
            for (Animal animal1 : animals1) {
                animal1.run();

            }





         }








    }
}