SELECT I.ANIMAL_ID, I.NAME 
FROM ANIMAL_INS I, ANIMAL_OUTS O
WHERE I.ANIMAL_ID=O.ANIMAL_ID
ORDER BY O.DATETIME-I.DATETIME DESC
LIMIT 2