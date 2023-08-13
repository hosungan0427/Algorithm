-- 코드를 입력하세요
SELECT H.CAR_ID FROM CAR_RENTAL_COMPANY_CAR C
INNER JOIN ( SELECT * from CAR_RENTAL_COMPANY_RENTAL_HISTORY
                      where start_date like '2022-10%'
                      group by car_id
            ) H ON C.CAR_ID = H.CAR_ID
WHERE CAR_TYPE = '세단'
ORDER BY H.CAR_ID DESC