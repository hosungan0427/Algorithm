-- 코드를 입력하세요
SELECT MONTH(START_DATE) AS MONTH, CAR_ID, COUNT(*) AS RECORDS 
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE CAR_ID IN (
            SELECT CAR_ID FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
            WHERE start_date between '2022-08-00' and '2022-11-00'
            group by CAR_ID
            HAVING COUNT(CAR_ID) >= 5
                   )
             AND START_DATE BETWEEN '2022-08-00' AND '2022-11-00'
GROUP BY MONTH(START_DATE), CAR_ID
ORDER BY MONTH, CAR_ID DESC