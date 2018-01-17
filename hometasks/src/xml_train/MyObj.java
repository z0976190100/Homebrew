

package xml_train;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class MyObj {


    int size;
    String name;
    boolean isUpdated;

    public int getSize() {
        return size;
    }
@XmlElement
    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public boolean isUpdated() {
        return isUpdated;
    }


    @XmlElement
    public void setUpdated(boolean updated) {
        isUpdated = updated;
    }
}

   /* Придумать свою предметную область (например, журналы, телефоны, компакт-диски и др).
        Разработать структуру xml-документа, представляющую собой хранилище элементов придуманной
        предметной области
        Для элемента этой предметной области создать свой класс (в Java) с несколькими атрибутами
        и хранилище объектов этого класса.  У хранилища должны быть методы:
        save(fileName) – производит сохранение хранилища в заданный файл в xml-формате
        load(fileName) – статический метод, производящий загрузку объекта из файла
*/