# Write your MySQL query statement below

SELECT e1.name
FROM employee e1
JOIN employee e2
    ON e2.managerId = e1.id
GROUP BY e1.id, e1.name
HAVING COUNT(*) >= 5;