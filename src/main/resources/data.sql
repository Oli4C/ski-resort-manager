INSERT INTO resort (name)

    VALUES  ('IDA Mountain');

INSERT INTO lift (name, open, open_from, open_until, seats_per_chair, resort_id)

    VALUES  ('ground', true, '08:00:00', '18:00:00', 4, 1),
            ('first', true, '08:00:00', '18:00:00', 4, 1),
            ('second', true, '08:00:00', '18:00:00', 4, 1),
            ('third', true, '08:00:00', '18:00:00', 4, 1),
            ('fourth', true, '08:00:00', '18:00:00', 4, 1),
            ('fifth', true, '08:00:00', '18:00:00', 4, 1);


-- INSERT INTO lift (name, open, open_from, open_until, seats_per_chair)
--
--     VALUES  ('ground', true, '08:00:00', '18:00:00', 4),
--             ('first', true, '08:00:00', '18:00:00', 4),
--             ('second', true, '08:00:00', '18:00:00', 4),
--             ('third', true, '08:00:00', '18:00:00', 4),
--             ('fourth', true, '08:00:00', '18:00:00', 4),
--             ('fifth', true, '08:00:00', '18:00:00', 4);

INSERT INTO slope (name, open, status, difficulty, height_start, height_end, lift_up_id, lift_down_id, resort_id)
    VALUES  ('firstToGround', true, 'open', 'GREEN', 200, 10, 2, 1, 1),
            ('secondToFirst', true, 'open', 'BLUE', 400, 200, 3, 2, 1),
            ('thirdToSecond', true, 'open', 'BLUE', 600, 400, 4, 3, 1),
            ('fourthToThird', true, 'open', 'RED', 800, 600, 5, 4, 1),
            ('fifthToFourth', true, 'open', 'BLACK', 1000, 800, 0, 5, 1);



-- INSERT INTO slope (name, open, status, difficulty, height_start, height_end)
--     VALUES  ('firstToGround', true, 'open', 'GREEN', 200, 10),
--             ('secondToFirst', true, 'open', 'BLUE', 400, 200),
--             ('thirdToSecond', true, 'open', 'BLUE', 600, 400),
--             ('fourthToThird', true, 'open', 'RED', 800, 600),
--             ('fifthToFourth', true, 'open', 'BLACK', 1000, 800);