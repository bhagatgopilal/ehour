ALTER TABLE TIMESHEET_ENTRY DROP DISPLAY_ORDER;
ALTER TABLE TIMESHEET_ENTRY MODIFY HOURS float(9,3) NULL;

UPDATE CONFIGURATION SET CONFIG_VALUE = '0.7.3' WHERE CONFIG_KEY = 'version';
