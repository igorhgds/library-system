CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS users (
    id                          UUID            PRIMARY KEY,
    name                        VARCHAR(255)    NOT NULl,
    email                       VARCHAR(255)    NOT NULL,
    password                    VARCHAR(255)    NOT NULL,
    user_role                   SMALLINT        NOT NULL,
    is_active                   BOOLEAN         NOT NULL DEFAULT FALSE,
    term_of_use_agreement       BOOLEAN         NOT NULL DEFAULT FALSE,
    privacy_policy_agreement    BOOLEAN         NOT NULL DEFAULT FALSE,
    password_recovery_code      VARCHAR(10)
    email_validated_at          TIMESTAMP,
    create_at                   TIMESTAMP       NOT NULL,
    update_at                   TIMESTAMP,
    finished_at                 TIMESTAMP,
)