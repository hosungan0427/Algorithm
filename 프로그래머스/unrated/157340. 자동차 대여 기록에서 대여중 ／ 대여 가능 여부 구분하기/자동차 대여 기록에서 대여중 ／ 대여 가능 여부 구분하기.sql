-- 코드를 입력하세요
SELECT DISTINCT(CAR_ID), 
                IF(CAR_ID IN (
                  SELECT distinct(car_id) 
                  FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
                  WHERE '2022-10-16' BETWEEN START_DATE AND END_DATE
                                      ), '대여중','대여 가능'
                            ) AS AVAILABILITY
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
ORDER BY CAR_ID DESC