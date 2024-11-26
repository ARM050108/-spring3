package koschei.models;

import koschei.KoscheiTheDeathless;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {

    private final KoscheiTheDeathless koschei;

    @Autowired
    public Needle7(KoscheiTheDeathless koschei) {
        this.koschei = koschei;
    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле :(";
    }
}
