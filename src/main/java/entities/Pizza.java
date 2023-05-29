package entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
@ToString
public class Pizza extends  Consumation{
    public Pizza(String name) {
        super(name, 4.99, 1104.0);
    }
}
