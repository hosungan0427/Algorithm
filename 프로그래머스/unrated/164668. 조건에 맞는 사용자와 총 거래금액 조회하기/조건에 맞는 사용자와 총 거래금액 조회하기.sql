-- 코드를 입력하세요
SELECT B.WRITER_ID AS USER_ID, NICKNAME, SUM(PRICE) AS TOTAL_SALES 
     FROM USED_GOODS_BOARD B
           INNER JOIN ( SELECT USER_ID AS WRITER_ID, NICKNAME 
                  FROM USED_GOODS_USER
                       ) U 
        ON B.WRITER_ID = U.WRITER_ID
WHERE STATUS ='DONE'
GROUP BY B.WRITER_ID
HAVING SUM(PRICE) >= 700000
order BY TOTAL_SALES asc