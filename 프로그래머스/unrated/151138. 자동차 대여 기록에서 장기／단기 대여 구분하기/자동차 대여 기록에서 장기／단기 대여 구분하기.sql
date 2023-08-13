-- 코드를 입력하세요
SELECT HISTORY_ID, CAR_ID, DATE_FORMAT(start_date, '%Y-%m-%d') as START_DATE, DATE_FORMAT(end_date, '%Y-%m-%d') as END_DATE,
        case when DATEDIFF( END_date, start_date)+1  >= 30 then '장기 대여'
        else '단기 대여' END as RENT_TYPE  
    from CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE start_date like '2022-09%' 
ORDER BY HISTORY_ID DESC