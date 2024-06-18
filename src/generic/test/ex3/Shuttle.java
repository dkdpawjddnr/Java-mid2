package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

// ShuttleTest를 참조하여 제네릭 타입을 사용해야 한다.
// showInfo() 메서드를 통해 탑승한 유닛의 정보를 출력한다.
public class Shuttle<T extends BioUnit> {
    T unit;
    public void in(T unit){
        this.unit = unit;
    }

    public T out(){
        return unit;
    }

    // 상한을 걸어 두어야 함.
    public void showInfo() {
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }
}
