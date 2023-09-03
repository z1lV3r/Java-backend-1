# Toy Car

In this exercise you'll be playing around with a remote controlled car, which you've finally saved enough money for to buy.

Cars start with full (100%) batteries. Each time you drive the car using the remote control, it covers 20 meters and drains one percent of the battery.

The remote controlled car has a fancy LED display that shows two bits of information:

- The total distance it has driven, displayed as: `"Driven <METERS> meters"`.
- The remaining battery charge, displayed as: `"Battery at <PERCENTAGE>%"`.

If the battery is at 0%, you can't drive the car anymore and the battery display will show `"Battery empty"`.

You have six tasks, each of which will work with remote controlled car instances.

## 1. Buy a brand-new remote controlled car

Implement the (_static_) `ToyCar.buy()` method to return a brand-new remote controlled car instance:

```java
ToyCar car = ToyCar.buy();
```

## 2. Display the distance driven

Implement the `ToyCar.distanceDisplay()` method to return the distance as displayed on the LED display:

```java
ToyCar car = ToyCar.buy();
car.distanceDisplay();
// => "Driven 0 meters"
```

## 3. Display the battery percentage

Implement the `ToyCar.batteryDisplay()` method to return the battery percentage as displayed on the LED display:

```java
ToyCar car = ToyCar.buy();
car.batteryDisplay();
// => "Battery at 100%"
```

## 4. Update the number of meters driven when driving

Implement the `ToyCar.drive()` method that updates the number of meters driven:

```java
ToyCar car = ToyCar.buy();
car.drive();
car.drive();
car.distanceDisplay();
// => "Driven 40 meters"
```

## 5. Update the battery percentage when driving

Update the `ToyCar.drive()` method to update the battery percentage:

```java
ToyCar car = ToyCar.buy();
car.drive();
car.drive();
car.batteryDisplay();
// => "Battery at 98%"
```

## 6. Prevent driving when the battery is drained

Update the `ToyCar.drive()` method to not increase the distance driven nor decrease the battery percentage when the battery is drained (at 0%):

```java
ToyCar car = ToyCar.buy();

// Drain the battery
// ...

car.distanceDisplay();
// => "Driven 2000 meters"

car.batteryDisplay();
// => "Battery empty"
```

### Created by

- @mikedamay

### Contributed to by

- @mirkoperillo