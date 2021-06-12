# Write your MySQL query statement below
SELECT DISTINCT Email FROM Person
WHERE Email in (SELECT DISTINCT Email
FROM Person
GROUP BY Email
HAVING count(*) >= 2)
