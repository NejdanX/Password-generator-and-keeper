INSERT INTO Role(role_name)
    VALUES  ('ROLE_ADMIN'),
            ('ROLE_USER');

INSERT INTO user_role(user_id, role_id)
    VALUES  (1, 1),
            (1, 2),
            (2, 2),
            (3, 1);