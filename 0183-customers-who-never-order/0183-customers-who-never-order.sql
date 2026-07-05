# Write your MySQL query statement below
select c.name as customers from customers c  left join orders on c.id=orders.customerid where orders.customerid is null;