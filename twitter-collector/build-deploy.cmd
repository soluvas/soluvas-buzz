call build
rsync --del -R -Pzrlt target/dependency target/classes config/*.dev.* config/*.prd.* *.md twitter-collector.sh ceefour@luna3.bippo.co.id:twitter-collector/
