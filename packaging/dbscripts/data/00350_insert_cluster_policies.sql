--
-- PostgreSQL database dump
--

--
-- Data for Name: cluster_policies; Type: TABLE DATA; Schema: public; Owner: engine
--

INSERT INTO cluster_policies (id, name, description, is_locked, is_default, custom_properties) VALUES ('20d25257-b4bd-4589-92a6-c4c5c5d3fd1a', 'evenly_distributed', '58cfb470-02f3-03d7-0386-0000000003bc', true, false, '{
  "CpuOverCommitDurationMinutes" : "2",
  "HighUtilization" : "80"
}');
INSERT INTO cluster_policies (id, name, description, is_locked, is_default, custom_properties) VALUES ('5a2b0939-7d46-4b73-a469-e9c2c7fc6a53', 'power_saving', '58cfb470-02f3-03d7-0386-0000000003bc', true, false, '{
  "CpuOverCommitDurationMinutes" : "2",
  "HighUtilization" : "80",
  "LowUtilization" : "20"
}');
INSERT INTO cluster_policies (id, name, description, is_locked, is_default, custom_properties) VALUES ('b4ed2332-a7ac-4d5f-9596-99a439cb2812', 'none', '58cfb470-02f3-03d7-0386-0000000003bc', true, true, NULL);
INSERT INTO cluster_policies (id, name, description, is_locked, is_default, custom_properties) VALUES ('8d5d7bec-68de-4a67-b53e-0ac54686d579', 'vm_evenly_distributed', '58cfb470-02f3-03d7-0386-0000000003bc', true, false, '{
  "HighVmCount" : "10",
  "MigrationThreshold" : "5",
  "SpmVmGrace" : "5"
}');


--
-- PostgreSQL database dump complete
--

