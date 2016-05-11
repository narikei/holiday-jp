# holiday-jp

Javaで使える日本の祝祭日を判定取得するライブラリです。

This is Java Library. Get holidays in Japan.

## 使い方 -USAGE-

### 今日は祝日かどうか
```java
  boolean isHoliday = HolidayUtil.isHoliday(new Date());
  // true or false
```

### ２０１６年３月２１日はなんの日か
```java
  Calendar cal = Calendar.getInstance();
  cal.set(2016, 2, 21);
  Holiday holiday = new Holiday(cal);
  System.out.println(holiday.getName());          // "春分の日"
  System.out.println(holiday.isHoliday());        // true
  System.out.println(holiday.isHappyMonday());    // true
```


### setup pom.xml

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <repositories>
        <repository>
            <id>holiday-jp</id>
            <url>https://raw.github.com/narikei/holiday-jp/mvn-repo/</url>
        </repository>
    </repositories>

    <dependencies>
        <dependency>
            <groupId>holiday-jp</groupId>
            <artifactId>holiday-jp</artifactId>
            <version>1.0</version>
        </dependency>
    </dependencies>
</project>
```
