package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class UnitUtil {
    // 입력하는 유닛의 타입과 반환하는 유닛의 타입이 같아야 한다.
    public static <T extends BioUnit> T maxHp(T t1, T t2) {
        return t1.getHp() > t2.getHp() ? t1 : t2;
    }
}
