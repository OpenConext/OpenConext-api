DROP TABLE IF EXISTS service_provider_group;

CREATE TABLE service_provider_group (
  id           BIGINT GENERATED BY DEFAULT AS IDENTITY (
  START WITH 1 ),
  sp_entity_id VARCHAR(1024) NOT NULL,
  team_id      VARCHAR(1024) NOT NULL,
  created_at   DATETIME      NOT NULL,
  updated_at   DATETIME,
  PRIMARY KEY (id)
);
