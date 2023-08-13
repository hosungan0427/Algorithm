-- 코드를 입력하세요
SELECT WAREHOUSE_ID, WAREHOUSE_NAME,ADDRESS,
        CASE  WHEN FREEZER_YN IS NULL THEN 'N'
                        WHEN FREEZER_YN = 'Y' THEN 'Y'
                        ELSE  'N' END AS FREEZER_YN 
        from FOOD_WAREHOUSE
where SUBSTRING(ADDRESS,1,3)='경기도'
Order by WAREHOUSE_ID