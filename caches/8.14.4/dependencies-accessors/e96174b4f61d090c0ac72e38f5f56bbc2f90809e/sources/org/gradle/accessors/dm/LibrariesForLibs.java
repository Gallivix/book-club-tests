package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.AttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the {@code libs} extension.
 */
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final BouncycastleLibraryAccessors laccForBouncycastleLibraryAccessors = new BouncycastleLibraryAccessors(owner);
    private final ComLibraryAccessors laccForComLibraryAccessors = new ComLibraryAccessors(owner);
    private final CommonsLibraryAccessors laccForCommonsLibraryAccessors = new CommonsLibraryAccessors(owner);
    private final CrptLibraryAccessors laccForCrptLibraryAccessors = new CrptLibraryAccessors(owner);
    private final HibernateLibraryAccessors laccForHibernateLibraryAccessors = new HibernateLibraryAccessors(owner);
    private final IoLibraryAccessors laccForIoLibraryAccessors = new IoLibraryAccessors(owner);
    private final JacksonLibraryAccessors laccForJacksonLibraryAccessors = new JacksonLibraryAccessors(owner);
    private final JakartaLibraryAccessors laccForJakartaLibraryAccessors = new JakartaLibraryAccessors(owner);
    private final JaninoLibraryAccessors laccForJaninoLibraryAccessors = new JaninoLibraryAccessors(owner);
    private final KotlinLibraryAccessors laccForKotlinLibraryAccessors = new KotlinLibraryAccessors(owner);
    private final LogbackLibraryAccessors laccForLogbackLibraryAccessors = new LogbackLibraryAccessors(owner);
    private final LogstashLibraryAccessors laccForLogstashLibraryAccessors = new LogstashLibraryAccessors(owner);
    private final MapstructLibraryAccessors laccForMapstructLibraryAccessors = new MapstructLibraryAccessors(owner);
    private final MinidevLibraryAccessors laccForMinidevLibraryAccessors = new MinidevLibraryAccessors(owner);
    private final MinioLibraryAccessors laccForMinioLibraryAccessors = new MinioLibraryAccessors(owner);
    private final NimbusLibraryAccessors laccForNimbusLibraryAccessors = new NimbusLibraryAccessors(owner);
    private final OrgLibraryAccessors laccForOrgLibraryAccessors = new OrgLibraryAccessors(owner);
    private final S3LibraryAccessors laccForS3LibraryAccessors = new S3LibraryAccessors(owner);
    private final ShedlockLibraryAccessors laccForShedlockLibraryAccessors = new ShedlockLibraryAccessors(owner);
    private final SoftwareLibraryAccessors laccForSoftwareLibraryAccessors = new SoftwareLibraryAccessors(owner);
    private final SpringLibraryAccessors laccForSpringLibraryAccessors = new SpringLibraryAccessors(owner);
    private final TestcontainersLibraryAccessors laccForTestcontainersLibraryAccessors = new TestcontainersLibraryAccessors(owner);
    private final TomcatLibraryAccessors laccForTomcatLibraryAccessors = new TomcatLibraryAccessors(owner);
    private final XmlunitLibraryAccessors laccForXmlunitLibraryAccessors = new XmlunitLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, AttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

    /**
     * Dependency provider for <b>preliquibase</b> with <b>net.lbruun.springboot:preliquibase-spring-boot-starter</b> coordinates and
     * with version reference <b>preliquibase.version</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getPreliquibase() {
        return create("preliquibase");
    }

    /**
     * Group of libraries at <b>bouncycastle</b>
     */
    public BouncycastleLibraryAccessors getBouncycastle() {
        return laccForBouncycastleLibraryAccessors;
    }

    /**
     * Group of libraries at <b>com</b>
     */
    public ComLibraryAccessors getCom() {
        return laccForComLibraryAccessors;
    }

    /**
     * Group of libraries at <b>commons</b>
     */
    public CommonsLibraryAccessors getCommons() {
        return laccForCommonsLibraryAccessors;
    }

    /**
     * Group of libraries at <b>crpt</b>
     */
    public CrptLibraryAccessors getCrpt() {
        return laccForCrptLibraryAccessors;
    }

    /**
     * Group of libraries at <b>hibernate</b>
     */
    public HibernateLibraryAccessors getHibernate() {
        return laccForHibernateLibraryAccessors;
    }

    /**
     * Group of libraries at <b>io</b>
     */
    public IoLibraryAccessors getIo() {
        return laccForIoLibraryAccessors;
    }

    /**
     * Group of libraries at <b>jackson</b>
     */
    public JacksonLibraryAccessors getJackson() {
        return laccForJacksonLibraryAccessors;
    }

    /**
     * Group of libraries at <b>jakarta</b>
     */
    public JakartaLibraryAccessors getJakarta() {
        return laccForJakartaLibraryAccessors;
    }

    /**
     * Group of libraries at <b>janino</b>
     */
    public JaninoLibraryAccessors getJanino() {
        return laccForJaninoLibraryAccessors;
    }

    /**
     * Group of libraries at <b>kotlin</b>
     */
    public KotlinLibraryAccessors getKotlin() {
        return laccForKotlinLibraryAccessors;
    }

    /**
     * Group of libraries at <b>logback</b>
     */
    public LogbackLibraryAccessors getLogback() {
        return laccForLogbackLibraryAccessors;
    }

    /**
     * Group of libraries at <b>logstash</b>
     */
    public LogstashLibraryAccessors getLogstash() {
        return laccForLogstashLibraryAccessors;
    }

    /**
     * Group of libraries at <b>mapstruct</b>
     */
    public MapstructLibraryAccessors getMapstruct() {
        return laccForMapstructLibraryAccessors;
    }

    /**
     * Group of libraries at <b>minidev</b>
     */
    public MinidevLibraryAccessors getMinidev() {
        return laccForMinidevLibraryAccessors;
    }

    /**
     * Group of libraries at <b>minio</b>
     */
    public MinioLibraryAccessors getMinio() {
        return laccForMinioLibraryAccessors;
    }

    /**
     * Group of libraries at <b>nimbus</b>
     */
    public NimbusLibraryAccessors getNimbus() {
        return laccForNimbusLibraryAccessors;
    }

    /**
     * Group of libraries at <b>org</b>
     */
    public OrgLibraryAccessors getOrg() {
        return laccForOrgLibraryAccessors;
    }

    /**
     * Group of libraries at <b>s3</b>
     */
    public S3LibraryAccessors getS3() {
        return laccForS3LibraryAccessors;
    }

    /**
     * Group of libraries at <b>shedlock</b>
     */
    public ShedlockLibraryAccessors getShedlock() {
        return laccForShedlockLibraryAccessors;
    }

    /**
     * Group of libraries at <b>software</b>
     */
    public SoftwareLibraryAccessors getSoftware() {
        return laccForSoftwareLibraryAccessors;
    }

    /**
     * Group of libraries at <b>spring</b>
     */
    public SpringLibraryAccessors getSpring() {
        return laccForSpringLibraryAccessors;
    }

    /**
     * Group of libraries at <b>testcontainers</b>
     */
    public TestcontainersLibraryAccessors getTestcontainers() {
        return laccForTestcontainersLibraryAccessors;
    }

    /**
     * Group of libraries at <b>tomcat</b>
     */
    public TomcatLibraryAccessors getTomcat() {
        return laccForTomcatLibraryAccessors;
    }

    /**
     * Group of libraries at <b>xmlunit</b>
     */
    public XmlunitLibraryAccessors getXmlunit() {
        return laccForXmlunitLibraryAccessors;
    }

    /**
     * Group of versions at <b>versions</b>
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Group of bundles at <b>bundles</b>
     */
    public BundleAccessors getBundles() {
        return baccForBundleAccessors;
    }

    /**
     * Group of plugins at <b>plugins</b>
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    public static class BouncycastleLibraryAccessors extends SubDependencyFactory {

        public BouncycastleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>bcprov</b> with <b>org.bouncycastle:bcprov-jdk18on</b> coordinates and
         * with version <b>1.78</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getBcprov() {
            return create("bouncycastle.bcprov");
        }

    }

    public static class ComLibraryAccessors extends SubDependencyFactory {
        private final ComClickhouseLibraryAccessors laccForComClickhouseLibraryAccessors = new ComClickhouseLibraryAccessors(owner);
        private final ComFasterxmlLibraryAccessors laccForComFasterxmlLibraryAccessors = new ComFasterxmlLibraryAccessors(owner);
        private final ComGithubLibraryAccessors laccForComGithubLibraryAccessors = new ComGithubLibraryAccessors(owner);
        private final ComGoogleLibraryAccessors laccForComGoogleLibraryAccessors = new ComGoogleLibraryAccessors(owner);
        private final ComJaywayLibraryAccessors laccForComJaywayLibraryAccessors = new ComJaywayLibraryAccessors(owner);
        private final ComSquareupLibraryAccessors laccForComSquareupLibraryAccessors = new ComSquareupLibraryAccessors(owner);
        private final ComSunLibraryAccessors laccForComSunLibraryAccessors = new ComSunLibraryAccessors(owner);
        private final ComZaxxerLibraryAccessors laccForComZaxxerLibraryAccessors = new ComZaxxerLibraryAccessors(owner);

        public ComLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.clickhouse</b>
         */
        public ComClickhouseLibraryAccessors getClickhouse() {
            return laccForComClickhouseLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.fasterxml</b>
         */
        public ComFasterxmlLibraryAccessors getFasterxml() {
            return laccForComFasterxmlLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.github</b>
         */
        public ComGithubLibraryAccessors getGithub() {
            return laccForComGithubLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.google</b>
         */
        public ComGoogleLibraryAccessors getGoogle() {
            return laccForComGoogleLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.jayway</b>
         */
        public ComJaywayLibraryAccessors getJayway() {
            return laccForComJaywayLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.squareup</b>
         */
        public ComSquareupLibraryAccessors getSquareup() {
            return laccForComSquareupLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.sun</b>
         */
        public ComSunLibraryAccessors getSun() {
            return laccForComSunLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.zaxxer</b>
         */
        public ComZaxxerLibraryAccessors getZaxxer() {
            return laccForComZaxxerLibraryAccessors;
        }

    }

    public static class ComClickhouseLibraryAccessors extends SubDependencyFactory {
        private final ComClickhouseClickhouseLibraryAccessors laccForComClickhouseClickhouseLibraryAccessors = new ComClickhouseClickhouseLibraryAccessors(owner);
        private final ComClickhouseClientLibraryAccessors laccForComClickhouseClientLibraryAccessors = new ComClickhouseClientLibraryAccessors(owner);

        public ComClickhouseLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.clickhouse.clickhouse</b>
         */
        public ComClickhouseClickhouseLibraryAccessors getClickhouse() {
            return laccForComClickhouseClickhouseLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.clickhouse.client</b>
         */
        public ComClickhouseClientLibraryAccessors getClient() {
            return laccForComClickhouseClientLibraryAccessors;
        }

    }

    public static class ComClickhouseClickhouseLibraryAccessors extends SubDependencyFactory {
        private final ComClickhouseClickhouseHttpLibraryAccessors laccForComClickhouseClickhouseHttpLibraryAccessors = new ComClickhouseClickhouseHttpLibraryAccessors(owner);

        public ComClickhouseClickhouseLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>client</b> with <b>com.clickhouse:clickhouse-client</b> coordinates and
         * with version reference <b>com.clickhouse.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getClient() {
            return create("com.clickhouse.clickhouse.client");
        }

        /**
         * Dependency provider for <b>data</b> with <b>com.clickhouse:clickhouse-data</b> coordinates and
         * with version reference <b>com.clickhouse.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getData() {
            return create("com.clickhouse.clickhouse.data");
        }

        /**
         * Dependency provider for <b>jdbc</b> with <b>com.clickhouse:clickhouse-jdbc</b> coordinates and
         * with version reference <b>com.clickhouse.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJdbc() {
            return create("com.clickhouse.clickhouse.jdbc");
        }

        /**
         * Group of libraries at <b>com.clickhouse.clickhouse.http</b>
         */
        public ComClickhouseClickhouseHttpLibraryAccessors getHttp() {
            return laccForComClickhouseClickhouseHttpLibraryAccessors;
        }

    }

    public static class ComClickhouseClickhouseHttpLibraryAccessors extends SubDependencyFactory {

        public ComClickhouseClickhouseHttpLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>client</b> with <b>com.clickhouse:clickhouse-http-client</b> coordinates and
         * with version reference <b>com.clickhouse.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getClient() {
            return create("com.clickhouse.clickhouse.http.client");
        }

    }

    public static class ComClickhouseClientLibraryAccessors extends SubDependencyFactory {

        public ComClickhouseClientLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>v2</b> with <b>com.clickhouse:client-v2</b> coordinates and
         * with version reference <b>com.clickhouse.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getV2() {
            return create("com.clickhouse.client.v2");
        }

    }

    public static class ComFasterxmlLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlJacksonLibraryAccessors laccForComFasterxmlJacksonLibraryAccessors = new ComFasterxmlJacksonLibraryAccessors(owner);
        private final ComFasterxmlUuidLibraryAccessors laccForComFasterxmlUuidLibraryAccessors = new ComFasterxmlUuidLibraryAccessors(owner);

        public ComFasterxmlLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.fasterxml.jackson</b>
         */
        public ComFasterxmlJacksonLibraryAccessors getJackson() {
            return laccForComFasterxmlJacksonLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.fasterxml.uuid</b>
         */
        public ComFasterxmlUuidLibraryAccessors getUuid() {
            return laccForComFasterxmlUuidLibraryAccessors;
        }

    }

    public static class ComFasterxmlJacksonLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlJacksonCoreLibraryAccessors laccForComFasterxmlJacksonCoreLibraryAccessors = new ComFasterxmlJacksonCoreLibraryAccessors(owner);
        private final ComFasterxmlJacksonDataformatLibraryAccessors laccForComFasterxmlJacksonDataformatLibraryAccessors = new ComFasterxmlJacksonDataformatLibraryAccessors(owner);
        private final ComFasterxmlJacksonDatatypeLibraryAccessors laccForComFasterxmlJacksonDatatypeLibraryAccessors = new ComFasterxmlJacksonDatatypeLibraryAccessors(owner);
        private final ComFasterxmlJacksonModuleLibraryAccessors laccForComFasterxmlJacksonModuleLibraryAccessors = new ComFasterxmlJacksonModuleLibraryAccessors(owner);

        public ComFasterxmlJacksonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.fasterxml.jackson.core</b>
         */
        public ComFasterxmlJacksonCoreLibraryAccessors getCore() {
            return laccForComFasterxmlJacksonCoreLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.fasterxml.jackson.dataformat</b>
         */
        public ComFasterxmlJacksonDataformatLibraryAccessors getDataformat() {
            return laccForComFasterxmlJacksonDataformatLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.fasterxml.jackson.datatype</b>
         */
        public ComFasterxmlJacksonDatatypeLibraryAccessors getDatatype() {
            return laccForComFasterxmlJacksonDatatypeLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.fasterxml.jackson.module</b>
         */
        public ComFasterxmlJacksonModuleLibraryAccessors getModule() {
            return laccForComFasterxmlJacksonModuleLibraryAccessors;
        }

    }

    public static class ComFasterxmlJacksonCoreLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlJacksonCoreJacksonLibraryAccessors laccForComFasterxmlJacksonCoreJacksonLibraryAccessors = new ComFasterxmlJacksonCoreJacksonLibraryAccessors(owner);

        public ComFasterxmlJacksonCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.fasterxml.jackson.core.jackson</b>
         */
        public ComFasterxmlJacksonCoreJacksonLibraryAccessors getJackson() {
            return laccForComFasterxmlJacksonCoreJacksonLibraryAccessors;
        }

    }

    public static class ComFasterxmlJacksonCoreJacksonLibraryAccessors extends SubDependencyFactory {

        public ComFasterxmlJacksonCoreJacksonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>annotations</b> with <b>com.fasterxml.jackson.core:jackson-annotations</b> coordinates and
         * with version reference <b>jackson.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAnnotations() {
            return create("com.fasterxml.jackson.core.jackson.annotations");
        }

        /**
         * Dependency provider for <b>core</b> with <b>com.fasterxml.jackson.core:jackson-core</b> coordinates and
         * with version reference <b>jackson.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("com.fasterxml.jackson.core.jackson.core");
        }

        /**
         * Dependency provider for <b>databind</b> with <b>com.fasterxml.jackson.core:jackson-databind</b> coordinates and
         * with version reference <b>jackson.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDatabind() {
            return create("com.fasterxml.jackson.core.jackson.databind");
        }

    }

    public static class ComFasterxmlJacksonDataformatLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlJacksonDataformatJacksonLibraryAccessors laccForComFasterxmlJacksonDataformatJacksonLibraryAccessors = new ComFasterxmlJacksonDataformatJacksonLibraryAccessors(owner);

        public ComFasterxmlJacksonDataformatLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.fasterxml.jackson.dataformat.jackson</b>
         */
        public ComFasterxmlJacksonDataformatJacksonLibraryAccessors getJackson() {
            return laccForComFasterxmlJacksonDataformatJacksonLibraryAccessors;
        }

    }

    public static class ComFasterxmlJacksonDataformatJacksonLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlJacksonDataformatJacksonDataformatLibraryAccessors laccForComFasterxmlJacksonDataformatJacksonDataformatLibraryAccessors = new ComFasterxmlJacksonDataformatJacksonDataformatLibraryAccessors(owner);

        public ComFasterxmlJacksonDataformatJacksonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.fasterxml.jackson.dataformat.jackson.dataformat</b>
         */
        public ComFasterxmlJacksonDataformatJacksonDataformatLibraryAccessors getDataformat() {
            return laccForComFasterxmlJacksonDataformatJacksonDataformatLibraryAccessors;
        }

    }

    public static class ComFasterxmlJacksonDataformatJacksonDataformatLibraryAccessors extends SubDependencyFactory {

        public ComFasterxmlJacksonDataformatJacksonDataformatLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>csv</b> with <b>com.fasterxml.jackson.dataformat:jackson-dataformat-csv</b> coordinates and
         * with version reference <b>jackson.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCsv() {
            return create("com.fasterxml.jackson.dataformat.jackson.dataformat.csv");
        }

    }

    public static class ComFasterxmlJacksonDatatypeLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlJacksonDatatypeJacksonLibraryAccessors laccForComFasterxmlJacksonDatatypeJacksonLibraryAccessors = new ComFasterxmlJacksonDatatypeJacksonLibraryAccessors(owner);

        public ComFasterxmlJacksonDatatypeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.fasterxml.jackson.datatype.jackson</b>
         */
        public ComFasterxmlJacksonDatatypeJacksonLibraryAccessors getJackson() {
            return laccForComFasterxmlJacksonDatatypeJacksonLibraryAccessors;
        }

    }

    public static class ComFasterxmlJacksonDatatypeJacksonLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlJacksonDatatypeJacksonDatatypeLibraryAccessors laccForComFasterxmlJacksonDatatypeJacksonDatatypeLibraryAccessors = new ComFasterxmlJacksonDatatypeJacksonDatatypeLibraryAccessors(owner);

        public ComFasterxmlJacksonDatatypeJacksonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.fasterxml.jackson.datatype.jackson.datatype</b>
         */
        public ComFasterxmlJacksonDatatypeJacksonDatatypeLibraryAccessors getDatatype() {
            return laccForComFasterxmlJacksonDatatypeJacksonDatatypeLibraryAccessors;
        }

    }

    public static class ComFasterxmlJacksonDatatypeJacksonDatatypeLibraryAccessors extends SubDependencyFactory {

        public ComFasterxmlJacksonDatatypeJacksonDatatypeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jdk8</b> with <b>com.fasterxml.jackson.datatype:jackson-datatype-jdk8</b> coordinates and
         * with version reference <b>jackson.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJdk8() {
            return create("com.fasterxml.jackson.datatype.jackson.datatype.jdk8");
        }

        /**
         * Dependency provider for <b>jsr310</b> with <b>com.fasterxml.jackson.datatype:jackson-datatype-jsr310</b> coordinates and
         * with version reference <b>jackson.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJsr310() {
            return create("com.fasterxml.jackson.datatype.jackson.datatype.jsr310");
        }

    }

    public static class ComFasterxmlJacksonModuleLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlJacksonModuleJacksonLibraryAccessors laccForComFasterxmlJacksonModuleJacksonLibraryAccessors = new ComFasterxmlJacksonModuleJacksonLibraryAccessors(owner);

        public ComFasterxmlJacksonModuleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.fasterxml.jackson.module.jackson</b>
         */
        public ComFasterxmlJacksonModuleJacksonLibraryAccessors getJackson() {
            return laccForComFasterxmlJacksonModuleJacksonLibraryAccessors;
        }

    }

    public static class ComFasterxmlJacksonModuleJacksonLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlJacksonModuleJacksonModuleLibraryAccessors laccForComFasterxmlJacksonModuleJacksonModuleLibraryAccessors = new ComFasterxmlJacksonModuleJacksonModuleLibraryAccessors(owner);

        public ComFasterxmlJacksonModuleJacksonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.fasterxml.jackson.module.jackson.module</b>
         */
        public ComFasterxmlJacksonModuleJacksonModuleLibraryAccessors getModule() {
            return laccForComFasterxmlJacksonModuleJacksonModuleLibraryAccessors;
        }

    }

    public static class ComFasterxmlJacksonModuleJacksonModuleLibraryAccessors extends SubDependencyFactory {

        public ComFasterxmlJacksonModuleJacksonModuleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>afterburner</b> with <b>com.fasterxml.jackson.module:jackson-module-afterburner</b> coordinates and
         * with version reference <b>jackson.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAfterburner() {
            return create("com.fasterxml.jackson.module.jackson.module.afterburner");
        }

        /**
         * Dependency provider for <b>blackbird</b> with <b>com.fasterxml.jackson.module:jackson-module-blackbird</b> coordinates and
         * with version reference <b>jackson.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getBlackbird() {
            return create("com.fasterxml.jackson.module.jackson.module.blackbird");
        }

        /**
         * Dependency provider for <b>kotlin</b> with <b>com.fasterxml.jackson.module:jackson-module-kotlin</b> coordinates and
         * with version reference <b>jackson.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKotlin() {
            return create("com.fasterxml.jackson.module.jackson.module.kotlin");
        }

    }

    public static class ComFasterxmlUuidLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlUuidJavaLibraryAccessors laccForComFasterxmlUuidJavaLibraryAccessors = new ComFasterxmlUuidJavaLibraryAccessors(owner);

        public ComFasterxmlUuidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.fasterxml.uuid.java</b>
         */
        public ComFasterxmlUuidJavaLibraryAccessors getJava() {
            return laccForComFasterxmlUuidJavaLibraryAccessors;
        }

    }

    public static class ComFasterxmlUuidJavaLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlUuidJavaUuidLibraryAccessors laccForComFasterxmlUuidJavaUuidLibraryAccessors = new ComFasterxmlUuidJavaUuidLibraryAccessors(owner);

        public ComFasterxmlUuidJavaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.fasterxml.uuid.java.uuid</b>
         */
        public ComFasterxmlUuidJavaUuidLibraryAccessors getUuid() {
            return laccForComFasterxmlUuidJavaUuidLibraryAccessors;
        }

    }

    public static class ComFasterxmlUuidJavaUuidLibraryAccessors extends SubDependencyFactory {

        public ComFasterxmlUuidJavaUuidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>generator</b> with <b>com.fasterxml.uuid:java-uuid-generator</b> coordinates and
         * with version reference <b>com.fasterxml.uuid.java.uuid.generator</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGenerator() {
            return create("com.fasterxml.uuid.java.uuid.generator");
        }

    }

    public static class ComGithubLibraryAccessors extends SubDependencyFactory {
        private final ComGithubBenLibraryAccessors laccForComGithubBenLibraryAccessors = new ComGithubBenLibraryAccessors(owner);
        private final ComGithubGrowthbookLibraryAccessors laccForComGithubGrowthbookLibraryAccessors = new ComGithubGrowthbookLibraryAccessors(owner);
        private final ComGithubIshugaliyLibraryAccessors laccForComGithubIshugaliyLibraryAccessors = new ComGithubIshugaliyLibraryAccessors(owner);
        private final ComGithubJsqlparserLibraryAccessors laccForComGithubJsqlparserLibraryAccessors = new ComGithubJsqlparserLibraryAccessors(owner);
        private final ComGithubLoki4jLibraryAccessors laccForComGithubLoki4jLibraryAccessors = new ComGithubLoki4jLibraryAccessors(owner);

        public ComGithubLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.github.ben</b>
         */
        public ComGithubBenLibraryAccessors getBen() {
            return laccForComGithubBenLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.github.growthbook</b>
         */
        public ComGithubGrowthbookLibraryAccessors getGrowthbook() {
            return laccForComGithubGrowthbookLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.github.ishugaliy</b>
         */
        public ComGithubIshugaliyLibraryAccessors getIshugaliy() {
            return laccForComGithubIshugaliyLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.github.jsqlparser</b>
         */
        public ComGithubJsqlparserLibraryAccessors getJsqlparser() {
            return laccForComGithubJsqlparserLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.github.loki4j</b>
         */
        public ComGithubLoki4jLibraryAccessors getLoki4j() {
            return laccForComGithubLoki4jLibraryAccessors;
        }

    }

    public static class ComGithubBenLibraryAccessors extends SubDependencyFactory {
        private final ComGithubBenManesLibraryAccessors laccForComGithubBenManesLibraryAccessors = new ComGithubBenManesLibraryAccessors(owner);

        public ComGithubBenLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.github.ben.manes</b>
         */
        public ComGithubBenManesLibraryAccessors getManes() {
            return laccForComGithubBenManesLibraryAccessors;
        }

    }

    public static class ComGithubBenManesLibraryAccessors extends SubDependencyFactory {
        private final ComGithubBenManesCaffeineLibraryAccessors laccForComGithubBenManesCaffeineLibraryAccessors = new ComGithubBenManesCaffeineLibraryAccessors(owner);

        public ComGithubBenManesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.github.ben.manes.caffeine</b>
         */
        public ComGithubBenManesCaffeineLibraryAccessors getCaffeine() {
            return laccForComGithubBenManesCaffeineLibraryAccessors;
        }

    }

    public static class ComGithubBenManesCaffeineLibraryAccessors extends SubDependencyFactory {

        public ComGithubBenManesCaffeineLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>caffeine</b> with <b>com.github.ben-manes.caffeine:caffeine</b> coordinates and
         * with version reference <b>com.github.ben.manes.caffeine.caffeine</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCaffeine() {
            return create("com.github.ben.manes.caffeine.caffeine");
        }

    }

    public static class ComGithubGrowthbookLibraryAccessors extends SubDependencyFactory {
        private final ComGithubGrowthbookGrowthbookLibraryAccessors laccForComGithubGrowthbookGrowthbookLibraryAccessors = new ComGithubGrowthbookGrowthbookLibraryAccessors(owner);

        public ComGithubGrowthbookLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.github.growthbook.growthbook</b>
         */
        public ComGithubGrowthbookGrowthbookLibraryAccessors getGrowthbook() {
            return laccForComGithubGrowthbookGrowthbookLibraryAccessors;
        }

    }

    public static class ComGithubGrowthbookGrowthbookLibraryAccessors extends SubDependencyFactory {
        private final ComGithubGrowthbookGrowthbookSdkLibraryAccessors laccForComGithubGrowthbookGrowthbookSdkLibraryAccessors = new ComGithubGrowthbookGrowthbookSdkLibraryAccessors(owner);

        public ComGithubGrowthbookGrowthbookLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.github.growthbook.growthbook.sdk</b>
         */
        public ComGithubGrowthbookGrowthbookSdkLibraryAccessors getSdk() {
            return laccForComGithubGrowthbookGrowthbookSdkLibraryAccessors;
        }

    }

    public static class ComGithubGrowthbookGrowthbookSdkLibraryAccessors extends SubDependencyFactory {

        public ComGithubGrowthbookGrowthbookSdkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>java</b> with <b>com.github.growthbook:growthbook-sdk-java</b> coordinates and
         * with version reference <b>com.github.growthbook.growthbook.sdk.java</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJava() {
            return create("com.github.growthbook.growthbook.sdk.java");
        }

    }

    public static class ComGithubIshugaliyLibraryAccessors extends SubDependencyFactory {
        private final ComGithubIshugaliyAllgoodLibraryAccessors laccForComGithubIshugaliyAllgoodLibraryAccessors = new ComGithubIshugaliyAllgoodLibraryAccessors(owner);

        public ComGithubIshugaliyLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.github.ishugaliy.allgood</b>
         */
        public ComGithubIshugaliyAllgoodLibraryAccessors getAllgood() {
            return laccForComGithubIshugaliyAllgoodLibraryAccessors;
        }

    }

    public static class ComGithubIshugaliyAllgoodLibraryAccessors extends SubDependencyFactory {
        private final ComGithubIshugaliyAllgoodConsistentLibraryAccessors laccForComGithubIshugaliyAllgoodConsistentLibraryAccessors = new ComGithubIshugaliyAllgoodConsistentLibraryAccessors(owner);

        public ComGithubIshugaliyAllgoodLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.github.ishugaliy.allgood.consistent</b>
         */
        public ComGithubIshugaliyAllgoodConsistentLibraryAccessors getConsistent() {
            return laccForComGithubIshugaliyAllgoodConsistentLibraryAccessors;
        }

    }

    public static class ComGithubIshugaliyAllgoodConsistentLibraryAccessors extends SubDependencyFactory {

        public ComGithubIshugaliyAllgoodConsistentLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>hash</b> with <b>com.github.ishugaliy:allgood-consistent-hash</b> coordinates and
         * with version reference <b>com.github.ishugaliy.allgood.consistent.hash</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getHash() {
            return create("com.github.ishugaliy.allgood.consistent.hash");
        }

    }

    public static class ComGithubJsqlparserLibraryAccessors extends SubDependencyFactory {

        public ComGithubJsqlparserLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jsqlparser</b> with <b>com.github.jsqlparser:jsqlparser</b> coordinates and
         * with version reference <b>com.github.jsqlparser.jsqlparser</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJsqlparser() {
            return create("com.github.jsqlparser.jsqlparser");
        }

    }

    public static class ComGithubLoki4jLibraryAccessors extends SubDependencyFactory {
        private final ComGithubLoki4jLokiLibraryAccessors laccForComGithubLoki4jLokiLibraryAccessors = new ComGithubLoki4jLokiLibraryAccessors(owner);

        public ComGithubLoki4jLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.github.loki4j.loki</b>
         */
        public ComGithubLoki4jLokiLibraryAccessors getLoki() {
            return laccForComGithubLoki4jLokiLibraryAccessors;
        }

    }

    public static class ComGithubLoki4jLokiLibraryAccessors extends SubDependencyFactory {
        private final ComGithubLoki4jLokiLogbackLibraryAccessors laccForComGithubLoki4jLokiLogbackLibraryAccessors = new ComGithubLoki4jLokiLogbackLibraryAccessors(owner);

        public ComGithubLoki4jLokiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.github.loki4j.loki.logback</b>
         */
        public ComGithubLoki4jLokiLogbackLibraryAccessors getLogback() {
            return laccForComGithubLoki4jLokiLogbackLibraryAccessors;
        }

    }

    public static class ComGithubLoki4jLokiLogbackLibraryAccessors extends SubDependencyFactory {

        public ComGithubLoki4jLokiLogbackLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>appender</b> with <b>com.github.loki4j:loki-logback-appender</b> coordinates and
         * with version reference <b>com.github.loki4j.loki.logback.appender</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAppender() {
            return create("com.github.loki4j.loki.logback.appender");
        }

    }

    public static class ComGoogleLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleGuavaLibraryAccessors laccForComGoogleGuavaLibraryAccessors = new ComGoogleGuavaLibraryAccessors(owner);
        private final ComGoogleProtobufLibraryAccessors laccForComGoogleProtobufLibraryAccessors = new ComGoogleProtobufLibraryAccessors(owner);

        public ComGoogleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.google.guava</b>
         */
        public ComGoogleGuavaLibraryAccessors getGuava() {
            return laccForComGoogleGuavaLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.google.protobuf</b>
         */
        public ComGoogleProtobufLibraryAccessors getProtobuf() {
            return laccForComGoogleProtobufLibraryAccessors;
        }

    }

    public static class ComGoogleGuavaLibraryAccessors extends SubDependencyFactory {

        public ComGoogleGuavaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>guava</b> with <b>com.google.guava:guava</b> coordinates and
         * with version reference <b>guava.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGuava() {
            return create("com.google.guava.guava");
        }

    }

    public static class ComGoogleProtobufLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleProtobufProtobufLibraryAccessors laccForComGoogleProtobufProtobufLibraryAccessors = new ComGoogleProtobufProtobufLibraryAccessors(owner);

        public ComGoogleProtobufLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.google.protobuf.protobuf</b>
         */
        public ComGoogleProtobufProtobufLibraryAccessors getProtobuf() {
            return laccForComGoogleProtobufProtobufLibraryAccessors;
        }

    }

    public static class ComGoogleProtobufProtobufLibraryAccessors extends SubDependencyFactory {

        public ComGoogleProtobufProtobufLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>java</b> with <b>com.google.protobuf:protobuf-java</b> coordinates and
         * with version reference <b>com.google.protobuf.protobuf.java</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJava() {
            return create("com.google.protobuf.protobuf.java");
        }

    }

    public static class ComJaywayLibraryAccessors extends SubDependencyFactory {
        private final ComJaywayJsonpathLibraryAccessors laccForComJaywayJsonpathLibraryAccessors = new ComJaywayJsonpathLibraryAccessors(owner);

        public ComJaywayLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.jayway.jsonpath</b>
         */
        public ComJaywayJsonpathLibraryAccessors getJsonpath() {
            return laccForComJaywayJsonpathLibraryAccessors;
        }

    }

    public static class ComJaywayJsonpathLibraryAccessors extends SubDependencyFactory {
        private final ComJaywayJsonpathJsonLibraryAccessors laccForComJaywayJsonpathJsonLibraryAccessors = new ComJaywayJsonpathJsonLibraryAccessors(owner);

        public ComJaywayJsonpathLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.jayway.jsonpath.json</b>
         */
        public ComJaywayJsonpathJsonLibraryAccessors getJson() {
            return laccForComJaywayJsonpathJsonLibraryAccessors;
        }

    }

    public static class ComJaywayJsonpathJsonLibraryAccessors extends SubDependencyFactory {

        public ComJaywayJsonpathJsonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>path</b> with <b>com.jayway.jsonpath:json-path</b> coordinates and
         * with version <b>2.9.0</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPath() {
            return create("com.jayway.jsonpath.json.path");
        }

    }

    public static class ComSquareupLibraryAccessors extends SubDependencyFactory {
        private final ComSquareupOkhttp3LibraryAccessors laccForComSquareupOkhttp3LibraryAccessors = new ComSquareupOkhttp3LibraryAccessors(owner);

        public ComSquareupLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.squareup.okhttp3</b>
         */
        public ComSquareupOkhttp3LibraryAccessors getOkhttp3() {
            return laccForComSquareupOkhttp3LibraryAccessors;
        }

    }

    public static class ComSquareupOkhttp3LibraryAccessors extends SubDependencyFactory {

        public ComSquareupOkhttp3LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>mockwebserver</b> with <b>com.squareup.okhttp3:mockwebserver</b> coordinates and
         * with version reference <b>okhttp.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMockwebserver() {
            return create("com.squareup.okhttp3.mockwebserver");
        }

        /**
         * Dependency provider for <b>okhttp</b> with <b>com.squareup.okhttp3:okhttp</b> coordinates and
         * with version reference <b>okhttp.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getOkhttp() {
            return create("com.squareup.okhttp3.okhttp");
        }

    }

    public static class ComSunLibraryAccessors extends SubDependencyFactory {
        private final ComSunXmlLibraryAccessors laccForComSunXmlLibraryAccessors = new ComSunXmlLibraryAccessors(owner);

        public ComSunLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.sun.xml</b>
         */
        public ComSunXmlLibraryAccessors getXml() {
            return laccForComSunXmlLibraryAccessors;
        }

    }

    public static class ComSunXmlLibraryAccessors extends SubDependencyFactory {
        private final ComSunXmlBindLibraryAccessors laccForComSunXmlBindLibraryAccessors = new ComSunXmlBindLibraryAccessors(owner);

        public ComSunXmlLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.sun.xml.bind</b>
         */
        public ComSunXmlBindLibraryAccessors getBind() {
            return laccForComSunXmlBindLibraryAccessors;
        }

    }

    public static class ComSunXmlBindLibraryAccessors extends SubDependencyFactory {
        private final ComSunXmlBindJaxbLibraryAccessors laccForComSunXmlBindJaxbLibraryAccessors = new ComSunXmlBindJaxbLibraryAccessors(owner);

        public ComSunXmlBindLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.sun.xml.bind.jaxb</b>
         */
        public ComSunXmlBindJaxbLibraryAccessors getJaxb() {
            return laccForComSunXmlBindJaxbLibraryAccessors;
        }

    }

    public static class ComSunXmlBindJaxbLibraryAccessors extends SubDependencyFactory {

        public ComSunXmlBindJaxbLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>com.sun.xml.bind:jaxb-core</b> coordinates and
         * with version reference <b>jaxb.version.impl</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("com.sun.xml.bind.jaxb.core");
        }

        /**
         * Dependency provider for <b>impl</b> with <b>com.sun.xml.bind:jaxb-impl</b> coordinates and
         * with version reference <b>jaxb.version.impl</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getImpl() {
            return create("com.sun.xml.bind.jaxb.impl");
        }

        /**
         * Dependency provider for <b>xjc</b> with <b>com.sun.xml.bind:jaxb-xjc</b> coordinates and
         * with version reference <b>jaxb.version.impl</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getXjc() {
            return create("com.sun.xml.bind.jaxb.xjc");
        }

    }

    public static class ComZaxxerLibraryAccessors extends SubDependencyFactory {

        public ComZaxxerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>hikaricp</b> with <b>com.zaxxer:HikariCP</b> coordinates and
         * with version reference <b>com.zaxxer.hikaricp</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getHikaricp() {
            return create("com.zaxxer.hikaricp");
        }

    }

    public static class CommonsLibraryAccessors extends SubDependencyFactory {
        private final CommonsIoLibraryAccessors laccForCommonsIoLibraryAccessors = new CommonsIoLibraryAccessors(owner);

        public CommonsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>codec</b> with <b>commons-codec:commons-codec</b> coordinates and
         * with version <b>1.17.1</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCodec() {
            return create("commons.codec");
        }

        /**
         * Dependency provider for <b>configuration</b> with <b>commons-configuration:commons-configuration</b> coordinates and
         * with version <b>1.10</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getConfiguration() {
            return create("commons.configuration");
        }

        /**
         * Dependency provider for <b>csv</b> with <b>org.apache.commons:commons-csv</b> coordinates and
         * with version <b>1.14.1</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCsv() {
            return create("commons.csv");
        }

        /**
         * Group of libraries at <b>commons.io</b>
         */
        public CommonsIoLibraryAccessors getIo() {
            return laccForCommonsIoLibraryAccessors;
        }

    }

    public static class CommonsIoLibraryAccessors extends SubDependencyFactory {
        private final CommonsIoCommonsLibraryAccessors laccForCommonsIoCommonsLibraryAccessors = new CommonsIoCommonsLibraryAccessors(owner);

        public CommonsIoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>commons.io.commons</b>
         */
        public CommonsIoCommonsLibraryAccessors getCommons() {
            return laccForCommonsIoCommonsLibraryAccessors;
        }

    }

    public static class CommonsIoCommonsLibraryAccessors extends SubDependencyFactory {

        public CommonsIoCommonsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>io</b> with <b>commons-io:commons-io</b> coordinates and
         * with version reference <b>commons.io.commons.io</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getIo() {
            return create("commons.io.commons.io");
        }

    }

    public static class CrptLibraryAccessors extends SubDependencyFactory {
        private final CrptBllkLibraryAccessors laccForCrptBllkLibraryAccessors = new CrptBllkLibraryAccessors(owner);

        public CrptLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>crpt.bllk</b>
         */
        public CrptBllkLibraryAccessors getBllk() {
            return laccForCrptBllkLibraryAccessors;
        }

    }

    public static class CrptBllkLibraryAccessors extends SubDependencyFactory {
        private final CrptBllkFeignLibraryAccessors laccForCrptBllkFeignLibraryAccessors = new CrptBllkFeignLibraryAccessors(owner);
        private final CrptBllkHeaderLibraryAccessors laccForCrptBllkHeaderLibraryAccessors = new CrptBllkHeaderLibraryAccessors(owner);
        private final CrptBllkLoggingLibraryAccessors laccForCrptBllkLoggingLibraryAccessors = new CrptBllkLoggingLibraryAccessors(owner);
        private final CrptBllkMonitoringLibraryAccessors laccForCrptBllkMonitoringLibraryAccessors = new CrptBllkMonitoringLibraryAccessors(owner);
        private final CrptBllkSwaggerLibraryAccessors laccForCrptBllkSwaggerLibraryAccessors = new CrptBllkSwaggerLibraryAccessors(owner);
        private final CrptBllkUnifiedLibraryAccessors laccForCrptBllkUnifiedLibraryAccessors = new CrptBllkUnifiedLibraryAccessors(owner);

        public CrptBllkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>crpt.bllk.feign</b>
         */
        public CrptBllkFeignLibraryAccessors getFeign() {
            return laccForCrptBllkFeignLibraryAccessors;
        }

        /**
         * Group of libraries at <b>crpt.bllk.header</b>
         */
        public CrptBllkHeaderLibraryAccessors getHeader() {
            return laccForCrptBllkHeaderLibraryAccessors;
        }

        /**
         * Group of libraries at <b>crpt.bllk.logging</b>
         */
        public CrptBllkLoggingLibraryAccessors getLogging() {
            return laccForCrptBllkLoggingLibraryAccessors;
        }

        /**
         * Group of libraries at <b>crpt.bllk.monitoring</b>
         */
        public CrptBllkMonitoringLibraryAccessors getMonitoring() {
            return laccForCrptBllkMonitoringLibraryAccessors;
        }

        /**
         * Group of libraries at <b>crpt.bllk.swagger</b>
         */
        public CrptBllkSwaggerLibraryAccessors getSwagger() {
            return laccForCrptBllkSwaggerLibraryAccessors;
        }

        /**
         * Group of libraries at <b>crpt.bllk.unified</b>
         */
        public CrptBllkUnifiedLibraryAccessors getUnified() {
            return laccForCrptBllkUnifiedLibraryAccessors;
        }

    }

    public static class CrptBllkFeignLibraryAccessors extends SubDependencyFactory {
        private final CrptBllkFeignWebmvcLibraryAccessors laccForCrptBllkFeignWebmvcLibraryAccessors = new CrptBllkFeignWebmvcLibraryAccessors(owner);

        public CrptBllkFeignLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>crpt.bllk.feign.webmvc</b>
         */
        public CrptBllkFeignWebmvcLibraryAccessors getWebmvc() {
            return laccForCrptBllkFeignWebmvcLibraryAccessors;
        }

    }

    public static class CrptBllkFeignWebmvcLibraryAccessors extends SubDependencyFactory {

        public CrptBllkFeignWebmvcLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>autoconfigure</b> with <b>ru.crpt.bllk:bllk-feign-webmvc-autoconfigure</b> coordinates and
         * with version reference <b>crpt.bllk.common.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAutoconfigure() {
            return create("crpt.bllk.feign.webmvc.autoconfigure");
        }

    }

    public static class CrptBllkHeaderLibraryAccessors extends SubDependencyFactory {
        private final CrptBllkHeaderForwardLibraryAccessors laccForCrptBllkHeaderForwardLibraryAccessors = new CrptBllkHeaderForwardLibraryAccessors(owner);

        public CrptBllkHeaderLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>crpt.bllk.header.forward</b>
         */
        public CrptBllkHeaderForwardLibraryAccessors getForward() {
            return laccForCrptBllkHeaderForwardLibraryAccessors;
        }

    }

    public static class CrptBllkHeaderForwardLibraryAccessors extends SubDependencyFactory {

        public CrptBllkHeaderForwardLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>autoconfigure</b> with <b>ru.crpt.bllk:bllk-header-forward-webmvc-autoconfigure</b> coordinates and
         * with version reference <b>crpt.bllk.common.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAutoconfigure() {
            return create("crpt.bllk.header.forward.autoconfigure");
        }

    }

    public static class CrptBllkLoggingLibraryAccessors extends SubDependencyFactory {

        public CrptBllkLoggingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>autoconfigure</b> with <b>ru.crpt.bllk:bllk-unified-logging-webmvc-autoconfigure</b> coordinates and
         * with version reference <b>crpt.bllk.common.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAutoconfigure() {
            return create("crpt.bllk.logging.autoconfigure");
        }

    }

    public static class CrptBllkMonitoringLibraryAccessors extends SubDependencyFactory {

        public CrptBllkMonitoringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>autoconfigure</b> with <b>ru.crpt.bllk:bllk-monitoring-webmvc-autoconfigure</b> coordinates and
         * with version reference <b>crpt.bllk.common.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAutoconfigure() {
            return create("crpt.bllk.monitoring.autoconfigure");
        }

    }

    public static class CrptBllkSwaggerLibraryAccessors extends SubDependencyFactory {

        public CrptBllkSwaggerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>autoconfigure</b> with <b>ru.crpt.bllk:bllk-swagger-autoconfigure</b> coordinates and
         * with version reference <b>crpt.bllk.common.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAutoconfigure() {
            return create("crpt.bllk.swagger.autoconfigure");
        }

    }

    public static class CrptBllkUnifiedLibraryAccessors extends SubDependencyFactory {
        private final CrptBllkUnifiedLoggingLibraryAccessors laccForCrptBllkUnifiedLoggingLibraryAccessors = new CrptBllkUnifiedLoggingLibraryAccessors(owner);

        public CrptBllkUnifiedLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>crpt.bllk.unified.logging</b>
         */
        public CrptBllkUnifiedLoggingLibraryAccessors getLogging() {
            return laccForCrptBllkUnifiedLoggingLibraryAccessors;
        }

    }

    public static class CrptBllkUnifiedLoggingLibraryAccessors extends SubDependencyFactory {
        private final CrptBllkUnifiedLoggingFeignLibraryAccessors laccForCrptBllkUnifiedLoggingFeignLibraryAccessors = new CrptBllkUnifiedLoggingFeignLibraryAccessors(owner);

        public CrptBllkUnifiedLoggingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>crpt.bllk.unified.logging.feign</b>
         */
        public CrptBllkUnifiedLoggingFeignLibraryAccessors getFeign() {
            return laccForCrptBllkUnifiedLoggingFeignLibraryAccessors;
        }

    }

    public static class CrptBllkUnifiedLoggingFeignLibraryAccessors extends SubDependencyFactory {

        public CrptBllkUnifiedLoggingFeignLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>autoconfigure</b> with <b>ru.crpt.bllk:bllk-unified-logging-feign-autoconfigure</b> coordinates and
         * with version reference <b>crpt.bllk.common.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAutoconfigure() {
            return create("crpt.bllk.unified.logging.feign.autoconfigure");
        }

    }

    public static class HibernateLibraryAccessors extends SubDependencyFactory {

        public HibernateLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jpamodelgen</b> with <b>org.hibernate:hibernate-jpamodelgen</b> coordinates and
         * with version reference <b>hibernate.jpa.model.gen.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJpamodelgen() {
            return create("hibernate.jpamodelgen");
        }

        /**
         * Dependency provider for <b>types</b> with <b>io.hypersistence:hypersistence-utils-hibernate-63</b> coordinates and
         * with version reference <b>hibernate.types.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTypes() {
            return create("hibernate.types");
        }

    }

    public static class IoLibraryAccessors extends SubDependencyFactory {
        private final IoDebeziumLibraryAccessors laccForIoDebeziumLibraryAccessors = new IoDebeziumLibraryAccessors(owner);
        private final IoGithubLibraryAccessors laccForIoGithubLibraryAccessors = new IoGithubLibraryAccessors(owner);
        private final IoJsonwebtokenLibraryAccessors laccForIoJsonwebtokenLibraryAccessors = new IoJsonwebtokenLibraryAccessors(owner);
        private final IoMicrometerLibraryAccessors laccForIoMicrometerLibraryAccessors = new IoMicrometerLibraryAccessors(owner);
        private final IoMockkLibraryAccessors laccForIoMockkLibraryAccessors = new IoMockkLibraryAccessors(owner);
        private final IoNettyLibraryAccessors laccForIoNettyLibraryAccessors = new IoNettyLibraryAccessors(owner);
        private final IoOpentelemetryLibraryAccessors laccForIoOpentelemetryLibraryAccessors = new IoOpentelemetryLibraryAccessors(owner);
        private final IoProjectreactorLibraryAccessors laccForIoProjectreactorLibraryAccessors = new IoProjectreactorLibraryAccessors(owner);
        private final IoQametaLibraryAccessors laccForIoQametaLibraryAccessors = new IoQametaLibraryAccessors(owner);
        private final IoTemporalLibraryAccessors laccForIoTemporalLibraryAccessors = new IoTemporalLibraryAccessors(owner);
        private final IoZonkyLibraryAccessors laccForIoZonkyLibraryAccessors = new IoZonkyLibraryAccessors(owner);

        public IoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.debezium</b>
         */
        public IoDebeziumLibraryAccessors getDebezium() {
            return laccForIoDebeziumLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.github</b>
         */
        public IoGithubLibraryAccessors getGithub() {
            return laccForIoGithubLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.jsonwebtoken</b>
         */
        public IoJsonwebtokenLibraryAccessors getJsonwebtoken() {
            return laccForIoJsonwebtokenLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.micrometer</b>
         */
        public IoMicrometerLibraryAccessors getMicrometer() {
            return laccForIoMicrometerLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.mockk</b>
         */
        public IoMockkLibraryAccessors getMockk() {
            return laccForIoMockkLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.netty</b>
         */
        public IoNettyLibraryAccessors getNetty() {
            return laccForIoNettyLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.opentelemetry</b>
         */
        public IoOpentelemetryLibraryAccessors getOpentelemetry() {
            return laccForIoOpentelemetryLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.projectreactor</b>
         */
        public IoProjectreactorLibraryAccessors getProjectreactor() {
            return laccForIoProjectreactorLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.qameta</b>
         */
        public IoQametaLibraryAccessors getQameta() {
            return laccForIoQametaLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.temporal</b>
         */
        public IoTemporalLibraryAccessors getTemporal() {
            return laccForIoTemporalLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.zonky</b>
         */
        public IoZonkyLibraryAccessors getZonky() {
            return laccForIoZonkyLibraryAccessors;
        }

    }

    public static class IoDebeziumLibraryAccessors extends SubDependencyFactory {
        private final IoDebeziumDebeziumLibraryAccessors laccForIoDebeziumDebeziumLibraryAccessors = new IoDebeziumDebeziumLibraryAccessors(owner);

        public IoDebeziumLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.debezium.debezium</b>
         */
        public IoDebeziumDebeziumLibraryAccessors getDebezium() {
            return laccForIoDebeziumDebeziumLibraryAccessors;
        }

    }

    public static class IoDebeziumDebeziumLibraryAccessors extends SubDependencyFactory {
        private final IoDebeziumDebeziumConnectorLibraryAccessors laccForIoDebeziumDebeziumConnectorLibraryAccessors = new IoDebeziumDebeziumConnectorLibraryAccessors(owner);
        private final IoDebeziumDebeziumStorageLibraryAccessors laccForIoDebeziumDebeziumStorageLibraryAccessors = new IoDebeziumDebeziumStorageLibraryAccessors(owner);

        public IoDebeziumDebeziumLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>api</b> with <b>io.debezium:debezium-api</b> coordinates and
         * with version reference <b>io.debezium.debezium.api</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getApi() {
            return create("io.debezium.debezium.api");
        }

        /**
         * Dependency provider for <b>embedded</b> with <b>io.debezium:debezium-embedded</b> coordinates and
         * with version reference <b>io.debezium.debezium.embedded</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getEmbedded() {
            return create("io.debezium.debezium.embedded");
        }

        /**
         * Group of libraries at <b>io.debezium.debezium.connector</b>
         */
        public IoDebeziumDebeziumConnectorLibraryAccessors getConnector() {
            return laccForIoDebeziumDebeziumConnectorLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.debezium.debezium.storage</b>
         */
        public IoDebeziumDebeziumStorageLibraryAccessors getStorage() {
            return laccForIoDebeziumDebeziumStorageLibraryAccessors;
        }

    }

    public static class IoDebeziumDebeziumConnectorLibraryAccessors extends SubDependencyFactory {

        public IoDebeziumDebeziumConnectorLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>postgres</b> with <b>io.debezium:debezium-connector-postgres</b> coordinates and
         * with version reference <b>io.debezium.debezium.connector.postgres</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPostgres() {
            return create("io.debezium.debezium.connector.postgres");
        }

    }

    public static class IoDebeziumDebeziumStorageLibraryAccessors extends SubDependencyFactory {

        public IoDebeziumDebeziumStorageLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jdbc</b> with <b>io.debezium:debezium-storage-jdbc</b> coordinates and
         * with version reference <b>io.debezium.debezium.storage.jdbc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJdbc() {
            return create("io.debezium.debezium.storage.jdbc");
        }

    }

    public static class IoGithubLibraryAccessors extends SubDependencyFactory {
        private final IoGithubMicroutilsLibraryAccessors laccForIoGithubMicroutilsLibraryAccessors = new IoGithubMicroutilsLibraryAccessors(owner);
        private final IoGithubResilience4jLibraryAccessors laccForIoGithubResilience4jLibraryAccessors = new IoGithubResilience4jLibraryAccessors(owner);

        public IoGithubLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.github.microutils</b>
         */
        public IoGithubMicroutilsLibraryAccessors getMicroutils() {
            return laccForIoGithubMicroutilsLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.github.resilience4j</b>
         */
        public IoGithubResilience4jLibraryAccessors getResilience4j() {
            return laccForIoGithubResilience4jLibraryAccessors;
        }

    }

    public static class IoGithubMicroutilsLibraryAccessors extends SubDependencyFactory {
        private final IoGithubMicroutilsKotlinLibraryAccessors laccForIoGithubMicroutilsKotlinLibraryAccessors = new IoGithubMicroutilsKotlinLibraryAccessors(owner);

        public IoGithubMicroutilsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.github.microutils.kotlin</b>
         */
        public IoGithubMicroutilsKotlinLibraryAccessors getKotlin() {
            return laccForIoGithubMicroutilsKotlinLibraryAccessors;
        }

    }

    public static class IoGithubMicroutilsKotlinLibraryAccessors extends SubDependencyFactory {
        private final IoGithubMicroutilsKotlinLoggingLibraryAccessors laccForIoGithubMicroutilsKotlinLoggingLibraryAccessors = new IoGithubMicroutilsKotlinLoggingLibraryAccessors(owner);

        public IoGithubMicroutilsKotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.github.microutils.kotlin.logging</b>
         */
        public IoGithubMicroutilsKotlinLoggingLibraryAccessors getLogging() {
            return laccForIoGithubMicroutilsKotlinLoggingLibraryAccessors;
        }

    }

    public static class IoGithubMicroutilsKotlinLoggingLibraryAccessors extends SubDependencyFactory {

        public IoGithubMicroutilsKotlinLoggingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jvm</b> with <b>io.github.microutils:kotlin-logging-jvm</b> coordinates and
         * with version reference <b>io.github.microutils.kotlin.logging.jvm</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJvm() {
            return create("io.github.microutils.kotlin.logging.jvm");
        }

    }

    public static class IoGithubResilience4jLibraryAccessors extends SubDependencyFactory {
        private final IoGithubResilience4jResilience4jLibraryAccessors laccForIoGithubResilience4jResilience4jLibraryAccessors = new IoGithubResilience4jResilience4jLibraryAccessors(owner);

        public IoGithubResilience4jLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.github.resilience4j.resilience4j</b>
         */
        public IoGithubResilience4jResilience4jLibraryAccessors getResilience4j() {
            return laccForIoGithubResilience4jResilience4jLibraryAccessors;
        }

    }

    public static class IoGithubResilience4jResilience4jLibraryAccessors extends SubDependencyFactory {

        public IoGithubResilience4jResilience4jLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>io.github.resilience4j:resilience4j-core</b> coordinates and
         * with version reference <b>io.github.resilience4j.resilience4j.core</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("io.github.resilience4j.resilience4j.core");
        }

        /**
         * Dependency provider for <b>kotlin</b> with <b>io.github.resilience4j:resilience4j-kotlin</b> coordinates and
         * with version reference <b>io.github.resilience4j.resilience4j.kotlin</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKotlin() {
            return create("io.github.resilience4j.resilience4j.kotlin");
        }

        /**
         * Dependency provider for <b>retry</b> with <b>io.github.resilience4j:resilience4j-retry</b> coordinates and
         * with version reference <b>io.github.resilience4j.resilience4j.retry</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRetry() {
            return create("io.github.resilience4j.resilience4j.retry");
        }

    }

    public static class IoJsonwebtokenLibraryAccessors extends SubDependencyFactory {
        private final IoJsonwebtokenJjwtLibraryAccessors laccForIoJsonwebtokenJjwtLibraryAccessors = new IoJsonwebtokenJjwtLibraryAccessors(owner);

        public IoJsonwebtokenLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.jsonwebtoken.jjwt</b>
         */
        public IoJsonwebtokenJjwtLibraryAccessors getJjwt() {
            return laccForIoJsonwebtokenJjwtLibraryAccessors;
        }

    }

    public static class IoJsonwebtokenJjwtLibraryAccessors extends SubDependencyFactory {

        public IoJsonwebtokenJjwtLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>api</b> with <b>io.jsonwebtoken:jjwt-api</b> coordinates and
         * with version reference <b>io.jsonwebtoken.jjwt.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getApi() {
            return create("io.jsonwebtoken.jjwt.api");
        }

        /**
         * Dependency provider for <b>impl</b> with <b>io.jsonwebtoken:jjwt-impl</b> coordinates and
         * with version reference <b>io.jsonwebtoken.jjwt.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getImpl() {
            return create("io.jsonwebtoken.jjwt.impl");
        }

        /**
         * Dependency provider for <b>jackson</b> with <b>io.jsonwebtoken:jjwt-jackson</b> coordinates and
         * with version reference <b>io.jsonwebtoken.jjwt.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJackson() {
            return create("io.jsonwebtoken.jjwt.jackson");
        }

    }

    public static class IoMicrometerLibraryAccessors extends SubDependencyFactory {
        private final IoMicrometerMicrometerLibraryAccessors laccForIoMicrometerMicrometerLibraryAccessors = new IoMicrometerMicrometerLibraryAccessors(owner);

        public IoMicrometerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.micrometer.micrometer</b>
         */
        public IoMicrometerMicrometerLibraryAccessors getMicrometer() {
            return laccForIoMicrometerMicrometerLibraryAccessors;
        }

    }

    public static class IoMicrometerMicrometerLibraryAccessors extends SubDependencyFactory {
        private final IoMicrometerMicrometerRegistryLibraryAccessors laccForIoMicrometerMicrometerRegistryLibraryAccessors = new IoMicrometerMicrometerRegistryLibraryAccessors(owner);

        public IoMicrometerMicrometerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>io.micrometer:micrometer-core</b> coordinates and
         * with version reference <b>io.micrometer.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("io.micrometer.micrometer.core");
        }

        /**
         * Group of libraries at <b>io.micrometer.micrometer.registry</b>
         */
        public IoMicrometerMicrometerRegistryLibraryAccessors getRegistry() {
            return laccForIoMicrometerMicrometerRegistryLibraryAccessors;
        }

    }

    public static class IoMicrometerMicrometerRegistryLibraryAccessors extends SubDependencyFactory {

        public IoMicrometerMicrometerRegistryLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>prometheus</b> with <b>io.micrometer:micrometer-registry-prometheus</b> coordinates and
         * with version reference <b>io.micrometer.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPrometheus() {
            return create("io.micrometer.micrometer.registry.prometheus");
        }

    }

    public static class IoMockkLibraryAccessors extends SubDependencyFactory {

        public IoMockkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>mockk</b> with <b>io.mockk:mockk</b> coordinates and
         * with version reference <b>mockk.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMockk() {
            return create("io.mockk.mockk");
        }

    }

    public static class IoNettyLibraryAccessors extends SubDependencyFactory {
        private final IoNettyNettyLibraryAccessors laccForIoNettyNettyLibraryAccessors = new IoNettyNettyLibraryAccessors(owner);

        public IoNettyLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.netty.netty</b>
         */
        public IoNettyNettyLibraryAccessors getNetty() {
            return laccForIoNettyNettyLibraryAccessors;
        }

    }

    public static class IoNettyNettyLibraryAccessors extends SubDependencyFactory {
        private final IoNettyNettyCodecLibraryAccessors laccForIoNettyNettyCodecLibraryAccessors = new IoNettyNettyCodecLibraryAccessors(owner);

        public IoNettyNettyLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.netty.netty.codec</b>
         */
        public IoNettyNettyCodecLibraryAccessors getCodec() {
            return laccForIoNettyNettyCodecLibraryAccessors;
        }

    }

    public static class IoNettyNettyCodecLibraryAccessors extends SubDependencyFactory {

        public IoNettyNettyCodecLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>http</b> with <b>io.netty:netty-codec-http</b> coordinates and
         * with version reference <b>io.netty.netty.codec.http</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getHttp() {
            return create("io.netty.netty.codec.http");
        }

    }

    public static class IoOpentelemetryLibraryAccessors extends SubDependencyFactory {
        private final IoOpentelemetryInstrumentationLibraryAccessors laccForIoOpentelemetryInstrumentationLibraryAccessors = new IoOpentelemetryInstrumentationLibraryAccessors(owner);
        private final IoOpentelemetryOpentelemetryLibraryAccessors laccForIoOpentelemetryOpentelemetryLibraryAccessors = new IoOpentelemetryOpentelemetryLibraryAccessors(owner);

        public IoOpentelemetryLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.opentelemetry.instrumentation</b>
         */
        public IoOpentelemetryInstrumentationLibraryAccessors getInstrumentation() {
            return laccForIoOpentelemetryInstrumentationLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.opentelemetry.opentelemetry</b>
         */
        public IoOpentelemetryOpentelemetryLibraryAccessors getOpentelemetry() {
            return laccForIoOpentelemetryOpentelemetryLibraryAccessors;
        }

    }

    public static class IoOpentelemetryInstrumentationLibraryAccessors extends SubDependencyFactory {
        private final IoOpentelemetryInstrumentationOpentelemetryLibraryAccessors laccForIoOpentelemetryInstrumentationOpentelemetryLibraryAccessors = new IoOpentelemetryInstrumentationOpentelemetryLibraryAccessors(owner);

        public IoOpentelemetryInstrumentationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.opentelemetry.instrumentation.opentelemetry</b>
         */
        public IoOpentelemetryInstrumentationOpentelemetryLibraryAccessors getOpentelemetry() {
            return laccForIoOpentelemetryInstrumentationOpentelemetryLibraryAccessors;
        }

    }

    public static class IoOpentelemetryInstrumentationOpentelemetryLibraryAccessors extends SubDependencyFactory {
        private final IoOpentelemetryInstrumentationOpentelemetryInstrumentationLibraryAccessors laccForIoOpentelemetryInstrumentationOpentelemetryInstrumentationLibraryAccessors = new IoOpentelemetryInstrumentationOpentelemetryInstrumentationLibraryAccessors(owner);

        public IoOpentelemetryInstrumentationOpentelemetryLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.opentelemetry.instrumentation.opentelemetry.instrumentation</b>
         */
        public IoOpentelemetryInstrumentationOpentelemetryInstrumentationLibraryAccessors getInstrumentation() {
            return laccForIoOpentelemetryInstrumentationOpentelemetryInstrumentationLibraryAccessors;
        }

    }

    public static class IoOpentelemetryInstrumentationOpentelemetryInstrumentationLibraryAccessors extends SubDependencyFactory {

        public IoOpentelemetryInstrumentationOpentelemetryInstrumentationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>bom</b> with <b>io.opentelemetry.instrumentation:opentelemetry-instrumentation-bom</b> coordinates and
         * with version reference <b>opentelemetry.instrumentation.bom</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getBom() {
            return create("io.opentelemetry.instrumentation.opentelemetry.instrumentation.bom");
        }

    }

    public static class IoOpentelemetryOpentelemetryLibraryAccessors extends SubDependencyFactory {
        private final IoOpentelemetryOpentelemetryExporterLibraryAccessors laccForIoOpentelemetryOpentelemetryExporterLibraryAccessors = new IoOpentelemetryOpentelemetryExporterLibraryAccessors(owner);
        private final IoOpentelemetryOpentelemetryOpentracingLibraryAccessors laccForIoOpentelemetryOpentelemetryOpentracingLibraryAccessors = new IoOpentelemetryOpentelemetryOpentracingLibraryAccessors(owner);
        private final IoOpentelemetryOpentelemetrySdkLibraryAccessors laccForIoOpentelemetryOpentelemetrySdkLibraryAccessors = new IoOpentelemetryOpentelemetrySdkLibraryAccessors(owner);

        public IoOpentelemetryOpentelemetryLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>common</b> with <b>io.opentelemetry:opentelemetry-common</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCommon() {
            return create("io.opentelemetry.opentelemetry.common");
        }

        /**
         * Group of libraries at <b>io.opentelemetry.opentelemetry.exporter</b>
         */
        public IoOpentelemetryOpentelemetryExporterLibraryAccessors getExporter() {
            return laccForIoOpentelemetryOpentelemetryExporterLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.opentelemetry.opentelemetry.opentracing</b>
         */
        public IoOpentelemetryOpentelemetryOpentracingLibraryAccessors getOpentracing() {
            return laccForIoOpentelemetryOpentelemetryOpentracingLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.opentelemetry.opentelemetry.sdk</b>
         */
        public IoOpentelemetryOpentelemetrySdkLibraryAccessors getSdk() {
            return laccForIoOpentelemetryOpentelemetrySdkLibraryAccessors;
        }

    }

    public static class IoOpentelemetryOpentelemetryExporterLibraryAccessors extends SubDependencyFactory {
        private final IoOpentelemetryOpentelemetryExporterOtlpLibraryAccessors laccForIoOpentelemetryOpentelemetryExporterOtlpLibraryAccessors = new IoOpentelemetryOpentelemetryExporterOtlpLibraryAccessors(owner);
        private final IoOpentelemetryOpentelemetryExporterSenderLibraryAccessors laccForIoOpentelemetryOpentelemetryExporterSenderLibraryAccessors = new IoOpentelemetryOpentelemetryExporterSenderLibraryAccessors(owner);

        public IoOpentelemetryOpentelemetryExporterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>common</b> with <b>io.opentelemetry:opentelemetry-exporter-common</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCommon() {
            return create("io.opentelemetry.opentelemetry.exporter.common");
        }

        /**
         * Group of libraries at <b>io.opentelemetry.opentelemetry.exporter.otlp</b>
         */
        public IoOpentelemetryOpentelemetryExporterOtlpLibraryAccessors getOtlp() {
            return laccForIoOpentelemetryOpentelemetryExporterOtlpLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.opentelemetry.opentelemetry.exporter.sender</b>
         */
        public IoOpentelemetryOpentelemetryExporterSenderLibraryAccessors getSender() {
            return laccForIoOpentelemetryOpentelemetryExporterSenderLibraryAccessors;
        }

    }

    public static class IoOpentelemetryOpentelemetryExporterOtlpLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public IoOpentelemetryOpentelemetryExporterOtlpLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>otlp</b> with <b>io.opentelemetry:opentelemetry-exporter-otlp</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("io.opentelemetry.opentelemetry.exporter.otlp");
        }

        /**
         * Dependency provider for <b>common</b> with <b>io.opentelemetry:opentelemetry-exporter-otlp-common</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCommon() {
            return create("io.opentelemetry.opentelemetry.exporter.otlp.common");
        }

    }

    public static class IoOpentelemetryOpentelemetryExporterSenderLibraryAccessors extends SubDependencyFactory {

        public IoOpentelemetryOpentelemetryExporterSenderLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>okhttp</b> with <b>io.opentelemetry:opentelemetry-exporter-sender-okhttp</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getOkhttp() {
            return create("io.opentelemetry.opentelemetry.exporter.sender.okhttp");
        }

    }

    public static class IoOpentelemetryOpentelemetryOpentracingLibraryAccessors extends SubDependencyFactory {

        public IoOpentelemetryOpentelemetryOpentracingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>shim</b> with <b>io.opentelemetry:opentelemetry-opentracing-shim</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getShim() {
            return create("io.opentelemetry.opentelemetry.opentracing.shim");
        }

    }

    public static class IoOpentelemetryOpentelemetrySdkLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public IoOpentelemetryOpentelemetrySdkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>sdk</b> with <b>io.opentelemetry:opentelemetry-sdk</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("io.opentelemetry.opentelemetry.sdk");
        }

        /**
         * Dependency provider for <b>common</b> with <b>io.opentelemetry:opentelemetry-sdk-common</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCommon() {
            return create("io.opentelemetry.opentelemetry.sdk.common");
        }

    }

    public static class IoProjectreactorLibraryAccessors extends SubDependencyFactory {
        private final IoProjectreactorKotlinLibraryAccessors laccForIoProjectreactorKotlinLibraryAccessors = new IoProjectreactorKotlinLibraryAccessors(owner);
        private final IoProjectreactorReactorLibraryAccessors laccForIoProjectreactorReactorLibraryAccessors = new IoProjectreactorReactorLibraryAccessors(owner);

        public IoProjectreactorLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.projectreactor.kotlin</b>
         */
        public IoProjectreactorKotlinLibraryAccessors getKotlin() {
            return laccForIoProjectreactorKotlinLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.projectreactor.reactor</b>
         */
        public IoProjectreactorReactorLibraryAccessors getReactor() {
            return laccForIoProjectreactorReactorLibraryAccessors;
        }

    }

    public static class IoProjectreactorKotlinLibraryAccessors extends SubDependencyFactory {
        private final IoProjectreactorKotlinReactorLibraryAccessors laccForIoProjectreactorKotlinReactorLibraryAccessors = new IoProjectreactorKotlinReactorLibraryAccessors(owner);

        public IoProjectreactorKotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.projectreactor.kotlin.reactor</b>
         */
        public IoProjectreactorKotlinReactorLibraryAccessors getReactor() {
            return laccForIoProjectreactorKotlinReactorLibraryAccessors;
        }

    }

    public static class IoProjectreactorKotlinReactorLibraryAccessors extends SubDependencyFactory {
        private final IoProjectreactorKotlinReactorKotlinLibraryAccessors laccForIoProjectreactorKotlinReactorKotlinLibraryAccessors = new IoProjectreactorKotlinReactorKotlinLibraryAccessors(owner);

        public IoProjectreactorKotlinReactorLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.projectreactor.kotlin.reactor.kotlin</b>
         */
        public IoProjectreactorKotlinReactorKotlinLibraryAccessors getKotlin() {
            return laccForIoProjectreactorKotlinReactorKotlinLibraryAccessors;
        }

    }

    public static class IoProjectreactorKotlinReactorKotlinLibraryAccessors extends SubDependencyFactory {

        public IoProjectreactorKotlinReactorKotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>extensions</b> with <b>io.projectreactor.kotlin:reactor-kotlin-extensions</b> coordinates and
         * with version reference <b>io.projectreactor.kotlin.reactor.kotlin.extensions</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getExtensions() {
            return create("io.projectreactor.kotlin.reactor.kotlin.extensions");
        }

    }

    public static class IoProjectreactorReactorLibraryAccessors extends SubDependencyFactory {

        public IoProjectreactorReactorLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>io.projectreactor:reactor-core</b> coordinates and
         * with version reference <b>io.projectreactor.reactor.core</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("io.projectreactor.reactor.core");
        }

        /**
         * Dependency provider for <b>test</b> with <b>io.projectreactor:reactor-test</b> coordinates and
         * with version reference <b>io.projectreactor.reactor.test</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTest() {
            return create("io.projectreactor.reactor.test");
        }

    }

    public static class IoQametaLibraryAccessors extends SubDependencyFactory {
        private final IoQametaAllureLibraryAccessors laccForIoQametaAllureLibraryAccessors = new IoQametaAllureLibraryAccessors(owner);

        public IoQametaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.qameta.allure</b>
         */
        public IoQametaAllureLibraryAccessors getAllure() {
            return laccForIoQametaAllureLibraryAccessors;
        }

    }

    public static class IoQametaAllureLibraryAccessors extends SubDependencyFactory {
        private final IoQametaAllureAllureLibraryAccessors laccForIoQametaAllureAllureLibraryAccessors = new IoQametaAllureAllureLibraryAccessors(owner);

        public IoQametaAllureLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.qameta.allure.allure</b>
         */
        public IoQametaAllureAllureLibraryAccessors getAllure() {
            return laccForIoQametaAllureAllureLibraryAccessors;
        }

    }

    public static class IoQametaAllureAllureLibraryAccessors extends SubDependencyFactory {
        private final IoQametaAllureAllureJavaLibraryAccessors laccForIoQametaAllureAllureJavaLibraryAccessors = new IoQametaAllureAllureJavaLibraryAccessors(owner);
        private final IoQametaAllureAllureJunitLibraryAccessors laccForIoQametaAllureAllureJunitLibraryAccessors = new IoQametaAllureAllureJunitLibraryAccessors(owner);
        private final IoQametaAllureAllureTestLibraryAccessors laccForIoQametaAllureAllureTestLibraryAccessors = new IoQametaAllureAllureTestLibraryAccessors(owner);

        public IoQametaAllureAllureLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>assertj</b> with <b>io.qameta.allure:allure-assertj</b> coordinates and
         * with version reference <b>allure.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAssertj() {
            return create("io.qameta.allure.allure.assertj");
        }

        /**
         * Dependency provider for <b>junit5</b> with <b>io.qameta.allure:allure-junit5</b> coordinates and
         * with version reference <b>allure.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJunit5() {
            return create("io.qameta.allure.allure.junit5");
        }

        /**
         * Dependency provider for <b>model</b> with <b>io.qameta.allure:allure-model</b> coordinates and
         * with version reference <b>allure.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getModel() {
            return create("io.qameta.allure.allure.model");
        }

        /**
         * Group of libraries at <b>io.qameta.allure.allure.java</b>
         */
        public IoQametaAllureAllureJavaLibraryAccessors getJava() {
            return laccForIoQametaAllureAllureJavaLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.qameta.allure.allure.junit</b>
         */
        public IoQametaAllureAllureJunitLibraryAccessors getJunit() {
            return laccForIoQametaAllureAllureJunitLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.qameta.allure.allure.test</b>
         */
        public IoQametaAllureAllureTestLibraryAccessors getTest() {
            return laccForIoQametaAllureAllureTestLibraryAccessors;
        }

    }

    public static class IoQametaAllureAllureJavaLibraryAccessors extends SubDependencyFactory {

        public IoQametaAllureAllureJavaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>commons</b> with <b>io.qameta.allure:allure-java-commons</b> coordinates and
         * with version reference <b>allure.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCommons() {
            return create("io.qameta.allure.allure.java.commons");
        }

    }

    public static class IoQametaAllureAllureJunitLibraryAccessors extends SubDependencyFactory {

        public IoQametaAllureAllureJunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>platform</b> with <b>io.qameta.allure:allure-junit-platform</b> coordinates and
         * with version reference <b>allure.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPlatform() {
            return create("io.qameta.allure.allure.junit.platform");
        }

    }

    public static class IoQametaAllureAllureTestLibraryAccessors extends SubDependencyFactory {

        public IoQametaAllureAllureTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>filter</b> with <b>io.qameta.allure:allure-test-filter</b> coordinates and
         * with version reference <b>allure.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getFilter() {
            return create("io.qameta.allure.allure.test.filter");
        }

    }

    public static class IoTemporalLibraryAccessors extends SubDependencyFactory {
        private final IoTemporalTemporalLibraryAccessors laccForIoTemporalTemporalLibraryAccessors = new IoTemporalTemporalLibraryAccessors(owner);

        public IoTemporalLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.temporal.temporal</b>
         */
        public IoTemporalTemporalLibraryAccessors getTemporal() {
            return laccForIoTemporalTemporalLibraryAccessors;
        }

    }

    public static class IoTemporalTemporalLibraryAccessors extends SubDependencyFactory {
        private final IoTemporalTemporalSpringLibraryAccessors laccForIoTemporalTemporalSpringLibraryAccessors = new IoTemporalTemporalSpringLibraryAccessors(owner);

        public IoTemporalTemporalLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>sdk</b> with <b>io.temporal:temporal-sdk</b> coordinates and
         * with version reference <b>temporal.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSdk() {
            return create("io.temporal.temporal.sdk");
        }

        /**
         * Dependency provider for <b>testing</b> with <b>io.temporal:temporal-testing</b> coordinates and
         * with version reference <b>temporal.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTesting() {
            return create("io.temporal.temporal.testing");
        }

        /**
         * Group of libraries at <b>io.temporal.temporal.spring</b>
         */
        public IoTemporalTemporalSpringLibraryAccessors getSpring() {
            return laccForIoTemporalTemporalSpringLibraryAccessors;
        }

    }

    public static class IoTemporalTemporalSpringLibraryAccessors extends SubDependencyFactory {
        private final IoTemporalTemporalSpringBootLibraryAccessors laccForIoTemporalTemporalSpringBootLibraryAccessors = new IoTemporalTemporalSpringBootLibraryAccessors(owner);

        public IoTemporalTemporalSpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.temporal.temporal.spring.boot</b>
         */
        public IoTemporalTemporalSpringBootLibraryAccessors getBoot() {
            return laccForIoTemporalTemporalSpringBootLibraryAccessors;
        }

    }

    public static class IoTemporalTemporalSpringBootLibraryAccessors extends SubDependencyFactory {

        public IoTemporalTemporalSpringBootLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>starter</b> with <b>io.temporal:temporal-spring-boot-starter</b> coordinates and
         * with version reference <b>temporal.spring.boot.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getStarter() {
            return create("io.temporal.temporal.spring.boot.starter");
        }

    }

    public static class IoZonkyLibraryAccessors extends SubDependencyFactory {
        private final IoZonkyTestLibraryAccessors laccForIoZonkyTestLibraryAccessors = new IoZonkyTestLibraryAccessors(owner);

        public IoZonkyLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.zonky.test</b>
         */
        public IoZonkyTestLibraryAccessors getTest() {
            return laccForIoZonkyTestLibraryAccessors;
        }

    }

    public static class IoZonkyTestLibraryAccessors extends SubDependencyFactory {
        private final IoZonkyTestEmbeddedLibraryAccessors laccForIoZonkyTestEmbeddedLibraryAccessors = new IoZonkyTestEmbeddedLibraryAccessors(owner);

        public IoZonkyTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.zonky.test.embedded</b>
         */
        public IoZonkyTestEmbeddedLibraryAccessors getEmbedded() {
            return laccForIoZonkyTestEmbeddedLibraryAccessors;
        }

    }

    public static class IoZonkyTestEmbeddedLibraryAccessors extends SubDependencyFactory {
        private final IoZonkyTestEmbeddedPostgresLibraryAccessors laccForIoZonkyTestEmbeddedPostgresLibraryAccessors = new IoZonkyTestEmbeddedPostgresLibraryAccessors(owner);

        public IoZonkyTestEmbeddedLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.zonky.test.embedded.postgres</b>
         */
        public IoZonkyTestEmbeddedPostgresLibraryAccessors getPostgres() {
            return laccForIoZonkyTestEmbeddedPostgresLibraryAccessors;
        }

    }

    public static class IoZonkyTestEmbeddedPostgresLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public IoZonkyTestEmbeddedPostgresLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>postgres</b> with <b>io.zonky.test:embedded-postgres</b> coordinates and
         * with version reference <b>embedded.postgres.lib.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("io.zonky.test.embedded.postgres");
        }

        /**
         * Dependency provider for <b>binaries</b> with <b>io.zonky.test.postgres:embedded-postgres-binaries-bom</b> coordinates and
         * with version reference <b>embedded.postgres.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getBinaries() {
            return create("io.zonky.test.embedded.postgres.binaries");
        }

    }

    public static class JacksonLibraryAccessors extends SubDependencyFactory {
        private final JacksonDataformatLibraryAccessors laccForJacksonDataformatLibraryAccessors = new JacksonDataformatLibraryAccessors(owner);

        public JacksonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>jackson.dataformat</b>
         */
        public JacksonDataformatLibraryAccessors getDataformat() {
            return laccForJacksonDataformatLibraryAccessors;
        }

    }

    public static class JacksonDataformatLibraryAccessors extends SubDependencyFactory {

        public JacksonDataformatLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>yaml</b> with <b>com.fasterxml.jackson.dataformat:jackson-dataformat-yaml</b> coordinates and
         * with version reference <b>jackson.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getYaml() {
            return create("jackson.dataformat.yaml");
        }

    }

    public static class JakartaLibraryAccessors extends SubDependencyFactory {
        private final JakartaAnnotationLibraryAccessors laccForJakartaAnnotationLibraryAccessors = new JakartaAnnotationLibraryAccessors(owner);
        private final JakartaValidationLibraryAccessors laccForJakartaValidationLibraryAccessors = new JakartaValidationLibraryAccessors(owner);
        private final JakartaXmlLibraryAccessors laccForJakartaXmlLibraryAccessors = new JakartaXmlLibraryAccessors(owner);

        public JakartaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>jakarta.annotation</b>
         */
        public JakartaAnnotationLibraryAccessors getAnnotation() {
            return laccForJakartaAnnotationLibraryAccessors;
        }

        /**
         * Group of libraries at <b>jakarta.validation</b>
         */
        public JakartaValidationLibraryAccessors getValidation() {
            return laccForJakartaValidationLibraryAccessors;
        }

        /**
         * Group of libraries at <b>jakarta.xml</b>
         */
        public JakartaXmlLibraryAccessors getXml() {
            return laccForJakartaXmlLibraryAccessors;
        }

    }

    public static class JakartaAnnotationLibraryAccessors extends SubDependencyFactory {
        private final JakartaAnnotationJakartaLibraryAccessors laccForJakartaAnnotationJakartaLibraryAccessors = new JakartaAnnotationJakartaLibraryAccessors(owner);

        public JakartaAnnotationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>jakarta.annotation.jakarta</b>
         */
        public JakartaAnnotationJakartaLibraryAccessors getJakarta() {
            return laccForJakartaAnnotationJakartaLibraryAccessors;
        }

    }

    public static class JakartaAnnotationJakartaLibraryAccessors extends SubDependencyFactory {
        private final JakartaAnnotationJakartaAnnotationLibraryAccessors laccForJakartaAnnotationJakartaAnnotationLibraryAccessors = new JakartaAnnotationJakartaAnnotationLibraryAccessors(owner);

        public JakartaAnnotationJakartaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>jakarta.annotation.jakarta.annotation</b>
         */
        public JakartaAnnotationJakartaAnnotationLibraryAccessors getAnnotation() {
            return laccForJakartaAnnotationJakartaAnnotationLibraryAccessors;
        }

    }

    public static class JakartaAnnotationJakartaAnnotationLibraryAccessors extends SubDependencyFactory {

        public JakartaAnnotationJakartaAnnotationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>api</b> with <b>jakarta.annotation:jakarta.annotation-api</b> coordinates and
         * with version reference <b>jakarta.annotation.jakarta.annotation.api</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getApi() {
            return create("jakarta.annotation.jakarta.annotation.api");
        }

    }

    public static class JakartaValidationLibraryAccessors extends SubDependencyFactory {
        private final JakartaValidationJakartaLibraryAccessors laccForJakartaValidationJakartaLibraryAccessors = new JakartaValidationJakartaLibraryAccessors(owner);

        public JakartaValidationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>jakarta.validation.jakarta</b>
         */
        public JakartaValidationJakartaLibraryAccessors getJakarta() {
            return laccForJakartaValidationJakartaLibraryAccessors;
        }

    }

    public static class JakartaValidationJakartaLibraryAccessors extends SubDependencyFactory {
        private final JakartaValidationJakartaValidationLibraryAccessors laccForJakartaValidationJakartaValidationLibraryAccessors = new JakartaValidationJakartaValidationLibraryAccessors(owner);

        public JakartaValidationJakartaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>jakarta.validation.jakarta.validation</b>
         */
        public JakartaValidationJakartaValidationLibraryAccessors getValidation() {
            return laccForJakartaValidationJakartaValidationLibraryAccessors;
        }

    }

    public static class JakartaValidationJakartaValidationLibraryAccessors extends SubDependencyFactory {

        public JakartaValidationJakartaValidationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>api</b> with <b>jakarta.validation:jakarta.validation-api</b> coordinates and
         * with version reference <b>jakarta.validation.jakarta.validation.api</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getApi() {
            return create("jakarta.validation.jakarta.validation.api");
        }

    }

    public static class JakartaXmlLibraryAccessors extends SubDependencyFactory {
        private final JakartaXmlBindLibraryAccessors laccForJakartaXmlBindLibraryAccessors = new JakartaXmlBindLibraryAccessors(owner);

        public JakartaXmlLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>jakarta.xml.bind</b>
         */
        public JakartaXmlBindLibraryAccessors getBind() {
            return laccForJakartaXmlBindLibraryAccessors;
        }

    }

    public static class JakartaXmlBindLibraryAccessors extends SubDependencyFactory {
        private final JakartaXmlBindJakartaLibraryAccessors laccForJakartaXmlBindJakartaLibraryAccessors = new JakartaXmlBindJakartaLibraryAccessors(owner);

        public JakartaXmlBindLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>jakarta.xml.bind.jakarta</b>
         */
        public JakartaXmlBindJakartaLibraryAccessors getJakarta() {
            return laccForJakartaXmlBindJakartaLibraryAccessors;
        }

    }

    public static class JakartaXmlBindJakartaLibraryAccessors extends SubDependencyFactory {
        private final JakartaXmlBindJakartaXmlLibraryAccessors laccForJakartaXmlBindJakartaXmlLibraryAccessors = new JakartaXmlBindJakartaXmlLibraryAccessors(owner);

        public JakartaXmlBindJakartaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>jakarta.xml.bind.jakarta.xml</b>
         */
        public JakartaXmlBindJakartaXmlLibraryAccessors getXml() {
            return laccForJakartaXmlBindJakartaXmlLibraryAccessors;
        }

    }

    public static class JakartaXmlBindJakartaXmlLibraryAccessors extends SubDependencyFactory {
        private final JakartaXmlBindJakartaXmlBindLibraryAccessors laccForJakartaXmlBindJakartaXmlBindLibraryAccessors = new JakartaXmlBindJakartaXmlBindLibraryAccessors(owner);

        public JakartaXmlBindJakartaXmlLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>jakarta.xml.bind.jakarta.xml.bind</b>
         */
        public JakartaXmlBindJakartaXmlBindLibraryAccessors getBind() {
            return laccForJakartaXmlBindJakartaXmlBindLibraryAccessors;
        }

    }

    public static class JakartaXmlBindJakartaXmlBindLibraryAccessors extends SubDependencyFactory {

        public JakartaXmlBindJakartaXmlBindLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>api</b> with <b>jakarta.xml.bind:jakarta.xml.bind-api</b> coordinates and
         * with version reference <b>jaxb.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getApi() {
            return create("jakarta.xml.bind.jakarta.xml.bind.api");
        }

    }

    public static class JaninoLibraryAccessors extends SubDependencyFactory {

        public JaninoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>library</b> with <b>org.codehaus.janino:janino</b> coordinates and
         * with version <b>3.1.12</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLibrary() {
            return create("janino.library");
        }

    }

    public static class KotlinLibraryAccessors extends SubDependencyFactory {

        public KotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>allopen</b> with <b>org.jetbrains.kotlin:kotlin-allopen</b> coordinates and
         * with version reference <b>kotlin.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAllopen() {
            return create("kotlin.allopen");
        }

    }

    public static class LogbackLibraryAccessors extends SubDependencyFactory {

        public LogbackLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>classic</b> with <b>ch.qos.logback:logback-classic</b> coordinates and
         * with version reference <b>logback.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getClassic() {
            return create("logback.classic");
        }

        /**
         * Dependency provider for <b>core</b> with <b>ch.qos.logback:logback-core</b> coordinates and
         * with version reference <b>logback.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("logback.core");
        }

    }

    public static class LogstashLibraryAccessors extends SubDependencyFactory {
        private final LogstashLogbackLibraryAccessors laccForLogstashLogbackLibraryAccessors = new LogstashLogbackLibraryAccessors(owner);

        public LogstashLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>logstash.logback</b>
         */
        public LogstashLogbackLibraryAccessors getLogback() {
            return laccForLogstashLogbackLibraryAccessors;
        }

    }

    public static class LogstashLogbackLibraryAccessors extends SubDependencyFactory {

        public LogstashLogbackLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>encoder</b> with <b>net.logstash.logback:logstash-logback-encoder</b> coordinates and
         * with version <b>7.4</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getEncoder() {
            return create("logstash.logback.encoder");
        }

    }

    public static class MapstructLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public MapstructLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>mapstruct</b> with <b>org.mapstruct:mapstruct</b> coordinates and
         * with version reference <b>mapstruct.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("mapstruct");
        }

        /**
         * Dependency provider for <b>processor</b> with <b>org.mapstruct:mapstruct-processor</b> coordinates and
         * with version reference <b>mapstruct.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getProcessor() {
            return create("mapstruct.processor");
        }

    }

    public static class MinidevLibraryAccessors extends SubDependencyFactory {
        private final MinidevJsonLibraryAccessors laccForMinidevJsonLibraryAccessors = new MinidevJsonLibraryAccessors(owner);

        public MinidevLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>minidev.json</b>
         */
        public MinidevJsonLibraryAccessors getJson() {
            return laccForMinidevJsonLibraryAccessors;
        }

    }

    public static class MinidevJsonLibraryAccessors extends SubDependencyFactory {

        public MinidevJsonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>smart</b> with <b>net.minidev:json-smart</b> coordinates and
         * with version <b>2.5.2</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSmart() {
            return create("minidev.json.smart");
        }

    }

    public static class MinioLibraryAccessors extends SubDependencyFactory {

        public MinioLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>clint</b> with <b>io.minio:minio</b> coordinates and
         * with version <b>8.5.10</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getClint() {
            return create("minio.clint");
        }

    }

    public static class NimbusLibraryAccessors extends SubDependencyFactory {

        public NimbusLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jwt</b> with <b>com.nimbusds:nimbus-jose-jwt</b> coordinates and
         * with version <b>9.37.2</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJwt() {
            return create("nimbus.jwt");
        }

    }

    public static class OrgLibraryAccessors extends SubDependencyFactory {
        private final OrgApacheLibraryAccessors laccForOrgApacheLibraryAccessors = new OrgApacheLibraryAccessors(owner);
        private final OrgAspectjLibraryAccessors laccForOrgAspectjLibraryAccessors = new OrgAspectjLibraryAccessors(owner);
        private final OrgAssertjLibraryAccessors laccForOrgAssertjLibraryAccessors = new OrgAssertjLibraryAccessors(owner);
        private final OrgAsynchttpclientLibraryAccessors laccForOrgAsynchttpclientLibraryAccessors = new OrgAsynchttpclientLibraryAccessors(owner);
        private final OrgAwaitilityLibraryAccessors laccForOrgAwaitilityLibraryAccessors = new OrgAwaitilityLibraryAccessors(owner);
        private final OrgHamcrestLibraryAccessors laccForOrgHamcrestLibraryAccessors = new OrgHamcrestLibraryAccessors(owner);
        private final OrgJetbrainsLibraryAccessors laccForOrgJetbrainsLibraryAccessors = new OrgJetbrainsLibraryAccessors(owner);
        private final OrgJunitLibraryAccessors laccForOrgJunitLibraryAccessors = new OrgJunitLibraryAccessors(owner);
        private final OrgLiquibaseLibraryAccessors laccForOrgLiquibaseLibraryAccessors = new OrgLiquibaseLibraryAccessors(owner);
        private final OrgLz4LibraryAccessors laccForOrgLz4LibraryAccessors = new OrgLz4LibraryAccessors(owner);
        private final OrgMockLibraryAccessors laccForOrgMockLibraryAccessors = new OrgMockLibraryAccessors(owner);
        private final OrgMockitoLibraryAccessors laccForOrgMockitoLibraryAccessors = new OrgMockitoLibraryAccessors(owner);
        private final OrgPostgresqlLibraryAccessors laccForOrgPostgresqlLibraryAccessors = new OrgPostgresqlLibraryAccessors(owner);
        private final OrgSpringdocLibraryAccessors laccForOrgSpringdocLibraryAccessors = new OrgSpringdocLibraryAccessors(owner);
        private final OrgSpringframeworkLibraryAccessors laccForOrgSpringframeworkLibraryAccessors = new OrgSpringframeworkLibraryAccessors(owner);
        private final OrgTestcontainersLibraryAccessors laccForOrgTestcontainersLibraryAccessors = new OrgTestcontainersLibraryAccessors(owner);

        public OrgLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.apache</b>
         */
        public OrgApacheLibraryAccessors getApache() {
            return laccForOrgApacheLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.aspectj</b>
         */
        public OrgAspectjLibraryAccessors getAspectj() {
            return laccForOrgAspectjLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.assertj</b>
         */
        public OrgAssertjLibraryAccessors getAssertj() {
            return laccForOrgAssertjLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.asynchttpclient</b>
         */
        public OrgAsynchttpclientLibraryAccessors getAsynchttpclient() {
            return laccForOrgAsynchttpclientLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.awaitility</b>
         */
        public OrgAwaitilityLibraryAccessors getAwaitility() {
            return laccForOrgAwaitilityLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.hamcrest</b>
         */
        public OrgHamcrestLibraryAccessors getHamcrest() {
            return laccForOrgHamcrestLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.jetbrains</b>
         */
        public OrgJetbrainsLibraryAccessors getJetbrains() {
            return laccForOrgJetbrainsLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.junit</b>
         */
        public OrgJunitLibraryAccessors getJunit() {
            return laccForOrgJunitLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.liquibase</b>
         */
        public OrgLiquibaseLibraryAccessors getLiquibase() {
            return laccForOrgLiquibaseLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.lz4</b>
         */
        public OrgLz4LibraryAccessors getLz4() {
            return laccForOrgLz4LibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.mock</b>
         */
        public OrgMockLibraryAccessors getMock() {
            return laccForOrgMockLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.mockito</b>
         */
        public OrgMockitoLibraryAccessors getMockito() {
            return laccForOrgMockitoLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.postgresql</b>
         */
        public OrgPostgresqlLibraryAccessors getPostgresql() {
            return laccForOrgPostgresqlLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.springdoc</b>
         */
        public OrgSpringdocLibraryAccessors getSpringdoc() {
            return laccForOrgSpringdocLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.springframework</b>
         */
        public OrgSpringframeworkLibraryAccessors getSpringframework() {
            return laccForOrgSpringframeworkLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.testcontainers</b>
         */
        public OrgTestcontainersLibraryAccessors getTestcontainers() {
            return laccForOrgTestcontainersLibraryAccessors;
        }

    }

    public static class OrgApacheLibraryAccessors extends SubDependencyFactory {
        private final OrgApacheCommonsLibraryAccessors laccForOrgApacheCommonsLibraryAccessors = new OrgApacheCommonsLibraryAccessors(owner);
        private final OrgApacheHttpcomponentsLibraryAccessors laccForOrgApacheHttpcomponentsLibraryAccessors = new OrgApacheHttpcomponentsLibraryAccessors(owner);
        private final OrgApacheKafkaLibraryAccessors laccForOrgApacheKafkaLibraryAccessors = new OrgApacheKafkaLibraryAccessors(owner);
        private final OrgApachePoiLibraryAccessors laccForOrgApachePoiLibraryAccessors = new OrgApachePoiLibraryAccessors(owner);

        public OrgApacheLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.apache.commons</b>
         */
        public OrgApacheCommonsLibraryAccessors getCommons() {
            return laccForOrgApacheCommonsLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.apache.httpcomponents</b>
         */
        public OrgApacheHttpcomponentsLibraryAccessors getHttpcomponents() {
            return laccForOrgApacheHttpcomponentsLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.apache.kafka</b>
         */
        public OrgApacheKafkaLibraryAccessors getKafka() {
            return laccForOrgApacheKafkaLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.apache.poi</b>
         */
        public OrgApachePoiLibraryAccessors getPoi() {
            return laccForOrgApachePoiLibraryAccessors;
        }

    }

    public static class OrgApacheCommonsLibraryAccessors extends SubDependencyFactory {
        private final OrgApacheCommonsCommonsLibraryAccessors laccForOrgApacheCommonsCommonsLibraryAccessors = new OrgApacheCommonsCommonsLibraryAccessors(owner);

        public OrgApacheCommonsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>collections4</b> with <b>org.apache.commons:commons-collections4</b> coordinates and
         * with version reference <b>org.apache.commons.collections4</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCollections4() {
            return create("org.apache.commons.collections4");
        }

        /**
         * Dependency provider for <b>lang3</b> with <b>org.apache.commons:commons-lang3</b> coordinates and
         * with version reference <b>org.apache.commons.lang3</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLang3() {
            return create("org.apache.commons.lang3");
        }

        /**
         * Dependency provider for <b>text</b> with <b>org.apache.commons:commons-text</b> coordinates and
         * with version <b>1.15.0</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getText() {
            return create("org.apache.commons.text");
        }

        /**
         * Dependency provider for <b>validator</b> with <b>commons-validator:commons-validator</b> coordinates and
         * with version reference <b>org.apache.commons.validator</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getValidator() {
            return create("org.apache.commons.validator");
        }

        /**
         * Group of libraries at <b>org.apache.commons.commons</b>
         */
        public OrgApacheCommonsCommonsLibraryAccessors getCommons() {
            return laccForOrgApacheCommonsCommonsLibraryAccessors;
        }

    }

    public static class OrgApacheCommonsCommonsLibraryAccessors extends SubDependencyFactory {

        public OrgApacheCommonsCommonsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>compress</b> with <b>org.apache.commons:commons-compress</b> coordinates and
         * with version reference <b>org.apache.commons.commons.compress</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCompress() {
            return create("org.apache.commons.commons.compress");
        }

    }

    public static class OrgApacheHttpcomponentsLibraryAccessors extends SubDependencyFactory {
        private final OrgApacheHttpcomponentsClient5LibraryAccessors laccForOrgApacheHttpcomponentsClient5LibraryAccessors = new OrgApacheHttpcomponentsClient5LibraryAccessors(owner);

        public OrgApacheHttpcomponentsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>httpclient</b> with <b>org.apache.httpcomponents:httpclient</b> coordinates and
         * with version reference <b>org.apache.httpcomponents.httpclient</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getHttpclient() {
            return create("org.apache.httpcomponents.httpclient");
        }

        /**
         * Dependency provider for <b>httpcore</b> with <b>org.apache.httpcomponents:httpcore</b> coordinates and
         * with version reference <b>org.apache.httpcomponents.httpcore</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getHttpcore() {
            return create("org.apache.httpcomponents.httpcore");
        }

        /**
         * Dependency provider for <b>httpmime</b> with <b>org.apache.httpcomponents:httpmime</b> coordinates and
         * with version reference <b>org.apache.httpcomponents.httpmime</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getHttpmime() {
            return create("org.apache.httpcomponents.httpmime");
        }

        /**
         * Group of libraries at <b>org.apache.httpcomponents.client5</b>
         */
        public OrgApacheHttpcomponentsClient5LibraryAccessors getClient5() {
            return laccForOrgApacheHttpcomponentsClient5LibraryAccessors;
        }

    }

    public static class OrgApacheHttpcomponentsClient5LibraryAccessors extends SubDependencyFactory {
        private final OrgApacheHttpcomponentsClient5Httpclient5LibraryAccessors laccForOrgApacheHttpcomponentsClient5Httpclient5LibraryAccessors = new OrgApacheHttpcomponentsClient5Httpclient5LibraryAccessors(owner);

        public OrgApacheHttpcomponentsClient5LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.apache.httpcomponents.client5.httpclient5</b>
         */
        public OrgApacheHttpcomponentsClient5Httpclient5LibraryAccessors getHttpclient5() {
            return laccForOrgApacheHttpcomponentsClient5Httpclient5LibraryAccessors;
        }

    }

    public static class OrgApacheHttpcomponentsClient5Httpclient5LibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public OrgApacheHttpcomponentsClient5Httpclient5LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>httpclient5</b> with <b>org.apache.httpcomponents.client5:httpclient5</b> coordinates and
         * with version reference <b>org.apache.httpcomponents.client5.httpclient5</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("org.apache.httpcomponents.client5.httpclient5");
        }

        /**
         * Dependency provider for <b>test</b> with <b>org.apache.httpcomponents.client5:httpclient5</b> coordinates and
         * with version reference <b>org.apache.httpcomponents.client5.httpclient5.test</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTest() {
            return create("org.apache.httpcomponents.client5.httpclient5.test");
        }

    }

    public static class OrgApacheKafkaLibraryAccessors extends SubDependencyFactory {
        private final OrgApacheKafkaKafkaLibraryAccessors laccForOrgApacheKafkaKafkaLibraryAccessors = new OrgApacheKafkaKafkaLibraryAccessors(owner);

        public OrgApacheKafkaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.apache.kafka.kafka</b>
         */
        public OrgApacheKafkaKafkaLibraryAccessors getKafka() {
            return laccForOrgApacheKafkaKafkaLibraryAccessors;
        }

    }

    public static class OrgApacheKafkaKafkaLibraryAccessors extends SubDependencyFactory {

        public OrgApacheKafkaKafkaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>clients</b> with <b>org.apache.kafka:kafka-clients</b> coordinates and
         * with version reference <b>org.apache.kafka.kafka.clients</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getClients() {
            return create("org.apache.kafka.kafka.clients");
        }

    }

    public static class OrgApachePoiLibraryAccessors extends SubDependencyFactory {
        private final OrgApachePoiPoiLibraryAccessors laccForOrgApachePoiPoiLibraryAccessors = new OrgApachePoiPoiLibraryAccessors(owner);

        public OrgApachePoiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.apache.poi.poi</b>
         */
        public OrgApachePoiPoiLibraryAccessors getPoi() {
            return laccForOrgApachePoiPoiLibraryAccessors;
        }

    }

    public static class OrgApachePoiPoiLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public OrgApachePoiPoiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>poi</b> with <b>org.apache.poi:poi</b> coordinates and
         * with version reference <b>org.apache.poi.poi</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("org.apache.poi.poi");
        }

        /**
         * Dependency provider for <b>ooxml</b> with <b>org.apache.poi:poi-ooxml</b> coordinates and
         * with version reference <b>org.apache.poi.poi.ooxml</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getOoxml() {
            return create("org.apache.poi.poi.ooxml");
        }

    }

    public static class OrgAspectjLibraryAccessors extends SubDependencyFactory {

        public OrgAspectjLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>aspectjrt</b> with <b>org.aspectj:aspectjrt</b> coordinates and
         * with version reference <b>org.aspectj.aspectjrt</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAspectjrt() {
            return create("org.aspectj.aspectjrt");
        }

        /**
         * Dependency provider for <b>aspectjweaver</b> with <b>org.aspectj:aspectjweaver</b> coordinates and
         * with version reference <b>org.aspectj.aspectjweaver</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAspectjweaver() {
            return create("org.aspectj.aspectjweaver");
        }

    }

    public static class OrgAssertjLibraryAccessors extends SubDependencyFactory {
        private final OrgAssertjAssertjLibraryAccessors laccForOrgAssertjAssertjLibraryAccessors = new OrgAssertjAssertjLibraryAccessors(owner);

        public OrgAssertjLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.assertj.assertj</b>
         */
        public OrgAssertjAssertjLibraryAccessors getAssertj() {
            return laccForOrgAssertjAssertjLibraryAccessors;
        }

    }

    public static class OrgAssertjAssertjLibraryAccessors extends SubDependencyFactory {

        public OrgAssertjAssertjLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>org.assertj:assertj-core</b> coordinates and
         * with version reference <b>org.assertj.assertj.core</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("org.assertj.assertj.core");
        }

    }

    public static class OrgAsynchttpclientLibraryAccessors extends SubDependencyFactory {
        private final OrgAsynchttpclientAsyncLibraryAccessors laccForOrgAsynchttpclientAsyncLibraryAccessors = new OrgAsynchttpclientAsyncLibraryAccessors(owner);

        public OrgAsynchttpclientLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.asynchttpclient.async</b>
         */
        public OrgAsynchttpclientAsyncLibraryAccessors getAsync() {
            return laccForOrgAsynchttpclientAsyncLibraryAccessors;
        }

    }

    public static class OrgAsynchttpclientAsyncLibraryAccessors extends SubDependencyFactory {
        private final OrgAsynchttpclientAsyncHttpLibraryAccessors laccForOrgAsynchttpclientAsyncHttpLibraryAccessors = new OrgAsynchttpclientAsyncHttpLibraryAccessors(owner);

        public OrgAsynchttpclientAsyncLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.asynchttpclient.async.http</b>
         */
        public OrgAsynchttpclientAsyncHttpLibraryAccessors getHttp() {
            return laccForOrgAsynchttpclientAsyncHttpLibraryAccessors;
        }

    }

    public static class OrgAsynchttpclientAsyncHttpLibraryAccessors extends SubDependencyFactory {

        public OrgAsynchttpclientAsyncHttpLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>client</b> with <b>org.asynchttpclient:async-http-client</b> coordinates and
         * with version reference <b>org.asynchttpclient.async.http.client</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getClient() {
            return create("org.asynchttpclient.async.http.client");
        }

    }

    public static class OrgAwaitilityLibraryAccessors extends SubDependencyFactory {
        private final OrgAwaitilityAwaitilityLibraryAccessors laccForOrgAwaitilityAwaitilityLibraryAccessors = new OrgAwaitilityAwaitilityLibraryAccessors(owner);

        public OrgAwaitilityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.awaitility.awaitility</b>
         */
        public OrgAwaitilityAwaitilityLibraryAccessors getAwaitility() {
            return laccForOrgAwaitilityAwaitilityLibraryAccessors;
        }

    }

    public static class OrgAwaitilityAwaitilityLibraryAccessors extends SubDependencyFactory {

        public OrgAwaitilityAwaitilityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>kotlin</b> with <b>org.awaitility:awaitility-kotlin</b> coordinates and
         * with version reference <b>org.awaitility.awaitility.kotlin</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKotlin() {
            return create("org.awaitility.awaitility.kotlin");
        }

    }

    public static class OrgHamcrestLibraryAccessors extends SubDependencyFactory {

        public OrgHamcrestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>hamcrest</b> with <b>org.hamcrest:hamcrest</b> coordinates and
         * with version reference <b>org.hamcrest.hamcrest</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getHamcrest() {
            return create("org.hamcrest.hamcrest");
        }

    }

    public static class OrgJetbrainsLibraryAccessors extends SubDependencyFactory {
        private final OrgJetbrainsKotlinLibraryAccessors laccForOrgJetbrainsKotlinLibraryAccessors = new OrgJetbrainsKotlinLibraryAccessors(owner);
        private final OrgJetbrainsKotlinxLibraryAccessors laccForOrgJetbrainsKotlinxLibraryAccessors = new OrgJetbrainsKotlinxLibraryAccessors(owner);

        public OrgJetbrainsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.jetbrains.kotlin</b>
         */
        public OrgJetbrainsKotlinLibraryAccessors getKotlin() {
            return laccForOrgJetbrainsKotlinLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.jetbrains.kotlinx</b>
         */
        public OrgJetbrainsKotlinxLibraryAccessors getKotlinx() {
            return laccForOrgJetbrainsKotlinxLibraryAccessors;
        }

    }

    public static class OrgJetbrainsKotlinLibraryAccessors extends SubDependencyFactory {
        private final OrgJetbrainsKotlinKotlinLibraryAccessors laccForOrgJetbrainsKotlinKotlinLibraryAccessors = new OrgJetbrainsKotlinKotlinLibraryAccessors(owner);

        public OrgJetbrainsKotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.jetbrains.kotlin.kotlin</b>
         */
        public OrgJetbrainsKotlinKotlinLibraryAccessors getKotlin() {
            return laccForOrgJetbrainsKotlinKotlinLibraryAccessors;
        }

    }

    public static class OrgJetbrainsKotlinKotlinLibraryAccessors extends SubDependencyFactory {
        private final OrgJetbrainsKotlinKotlinTestLibraryAccessors laccForOrgJetbrainsKotlinKotlinTestLibraryAccessors = new OrgJetbrainsKotlinKotlinTestLibraryAccessors(owner);

        public OrgJetbrainsKotlinKotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>reflect</b> with <b>org.jetbrains.kotlin:kotlin-reflect</b> coordinates and
         * with version reference <b>kotlin.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getReflect() {
            return create("org.jetbrains.kotlin.kotlin.reflect");
        }

        /**
         * Dependency provider for <b>stdlib</b> with <b>org.jetbrains.kotlin:kotlin-stdlib</b> coordinates and
         * with version reference <b>kotlin.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getStdlib() {
            return create("org.jetbrains.kotlin.kotlin.stdlib");
        }

        /**
         * Group of libraries at <b>org.jetbrains.kotlin.kotlin.test</b>
         */
        public OrgJetbrainsKotlinKotlinTestLibraryAccessors getTest() {
            return laccForOrgJetbrainsKotlinKotlinTestLibraryAccessors;
        }

    }

    public static class OrgJetbrainsKotlinKotlinTestLibraryAccessors extends SubDependencyFactory {

        public OrgJetbrainsKotlinKotlinTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>junit5</b> with <b>org.jetbrains.kotlin:kotlin-test-junit5</b> coordinates and
         * with version reference <b>kotlin.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJunit5() {
            return create("org.jetbrains.kotlin.kotlin.test.junit5");
        }

    }

    public static class OrgJetbrainsKotlinxLibraryAccessors extends SubDependencyFactory {
        private final OrgJetbrainsKotlinxKotlinxLibraryAccessors laccForOrgJetbrainsKotlinxKotlinxLibraryAccessors = new OrgJetbrainsKotlinxKotlinxLibraryAccessors(owner);

        public OrgJetbrainsKotlinxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.jetbrains.kotlinx.kotlinx</b>
         */
        public OrgJetbrainsKotlinxKotlinxLibraryAccessors getKotlinx() {
            return laccForOrgJetbrainsKotlinxKotlinxLibraryAccessors;
        }

    }

    public static class OrgJetbrainsKotlinxKotlinxLibraryAccessors extends SubDependencyFactory {
        private final OrgJetbrainsKotlinxKotlinxCoroutinesLibraryAccessors laccForOrgJetbrainsKotlinxKotlinxCoroutinesLibraryAccessors = new OrgJetbrainsKotlinxKotlinxCoroutinesLibraryAccessors(owner);

        public OrgJetbrainsKotlinxKotlinxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>datetime</b> with <b>org.jetbrains.kotlinx:kotlinx-datetime</b> coordinates and
         * with version reference <b>org.jetbrains.kotlinx.kotlinx.datetime</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDatetime() {
            return create("org.jetbrains.kotlinx.kotlinx.datetime");
        }

        /**
         * Group of libraries at <b>org.jetbrains.kotlinx.kotlinx.coroutines</b>
         */
        public OrgJetbrainsKotlinxKotlinxCoroutinesLibraryAccessors getCoroutines() {
            return laccForOrgJetbrainsKotlinxKotlinxCoroutinesLibraryAccessors;
        }

    }

    public static class OrgJetbrainsKotlinxKotlinxCoroutinesLibraryAccessors extends SubDependencyFactory {
        private final OrgJetbrainsKotlinxKotlinxCoroutinesCoreLibraryAccessors laccForOrgJetbrainsKotlinxKotlinxCoroutinesCoreLibraryAccessors = new OrgJetbrainsKotlinxKotlinxCoroutinesCoreLibraryAccessors(owner);

        public OrgJetbrainsKotlinxKotlinxCoroutinesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jdk8</b> with <b>org.jetbrains.kotlinx:kotlinx-coroutines-jdk8</b> coordinates and
         * with version reference <b>org.jetbrains.kotlinx.coroutines</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJdk8() {
            return create("org.jetbrains.kotlinx.kotlinx.coroutines.jdk8");
        }

        /**
         * Dependency provider for <b>reactor</b> with <b>org.jetbrains.kotlinx:kotlinx-coroutines-reactor</b> coordinates and
         * with version reference <b>org.jetbrains.kotlinx.coroutines</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getReactor() {
            return create("org.jetbrains.kotlinx.kotlinx.coroutines.reactor");
        }

        /**
         * Dependency provider for <b>test</b> with <b>org.jetbrains.kotlinx:kotlinx-coroutines-test</b> coordinates and
         * with version reference <b>org.jetbrains.kotlinx.coroutines</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTest() {
            return create("org.jetbrains.kotlinx.kotlinx.coroutines.test");
        }

        /**
         * Group of libraries at <b>org.jetbrains.kotlinx.kotlinx.coroutines.core</b>
         */
        public OrgJetbrainsKotlinxKotlinxCoroutinesCoreLibraryAccessors getCore() {
            return laccForOrgJetbrainsKotlinxKotlinxCoroutinesCoreLibraryAccessors;
        }

    }

    public static class OrgJetbrainsKotlinxKotlinxCoroutinesCoreLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public OrgJetbrainsKotlinxKotlinxCoroutinesCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>org.jetbrains.kotlinx:kotlinx-coroutines-core</b> coordinates and
         * with version reference <b>org.jetbrains.kotlinx.coroutines</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("org.jetbrains.kotlinx.kotlinx.coroutines.core");
        }

        /**
         * Dependency provider for <b>jvm</b> with <b>org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm</b> coordinates and
         * with version reference <b>org.jetbrains.kotlinx.coroutines</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJvm() {
            return create("org.jetbrains.kotlinx.kotlinx.coroutines.core.jvm");
        }

    }

    public static class OrgJunitLibraryAccessors extends SubDependencyFactory {
        private final OrgJunitJupiterLibraryAccessors laccForOrgJunitJupiterLibraryAccessors = new OrgJunitJupiterLibraryAccessors(owner);
        private final OrgJunitPlatformLibraryAccessors laccForOrgJunitPlatformLibraryAccessors = new OrgJunitPlatformLibraryAccessors(owner);

        public OrgJunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.junit.jupiter</b>
         */
        public OrgJunitJupiterLibraryAccessors getJupiter() {
            return laccForOrgJunitJupiterLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.junit.platform</b>
         */
        public OrgJunitPlatformLibraryAccessors getPlatform() {
            return laccForOrgJunitPlatformLibraryAccessors;
        }

    }

    public static class OrgJunitJupiterLibraryAccessors extends SubDependencyFactory {
        private final OrgJunitJupiterJunitLibraryAccessors laccForOrgJunitJupiterJunitLibraryAccessors = new OrgJunitJupiterJunitLibraryAccessors(owner);

        public OrgJunitJupiterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.junit.jupiter.junit</b>
         */
        public OrgJunitJupiterJunitLibraryAccessors getJunit() {
            return laccForOrgJunitJupiterJunitLibraryAccessors;
        }

    }

    public static class OrgJunitJupiterJunitLibraryAccessors extends SubDependencyFactory {
        private final OrgJunitJupiterJunitJupiterLibraryAccessors laccForOrgJunitJupiterJunitJupiterLibraryAccessors = new OrgJunitJupiterJunitJupiterLibraryAccessors(owner);

        public OrgJunitJupiterJunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.junit.jupiter.junit.jupiter</b>
         */
        public OrgJunitJupiterJunitJupiterLibraryAccessors getJupiter() {
            return laccForOrgJunitJupiterJunitJupiterLibraryAccessors;
        }

    }

    public static class OrgJunitJupiterJunitJupiterLibraryAccessors extends SubDependencyFactory {

        public OrgJunitJupiterJunitJupiterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>api</b> with <b>org.junit.jupiter:junit-jupiter-api</b> coordinates and
         * with version reference <b>junit.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getApi() {
            return create("org.junit.jupiter.junit.jupiter.api");
        }

        /**
         * Dependency provider for <b>engine</b> with <b>org.junit.jupiter:junit-jupiter-engine</b> coordinates and
         * with version reference <b>org.junit.jupiter.junit.jupiter.engine</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getEngine() {
            return create("org.junit.jupiter.junit.jupiter.engine");
        }

        /**
         * Dependency provider for <b>params</b> with <b>org.junit.jupiter:junit-jupiter-params</b> coordinates and
         * with version reference <b>junit.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getParams() {
            return create("org.junit.jupiter.junit.jupiter.params");
        }

    }

    public static class OrgJunitPlatformLibraryAccessors extends SubDependencyFactory {
        private final OrgJunitPlatformJunitLibraryAccessors laccForOrgJunitPlatformJunitLibraryAccessors = new OrgJunitPlatformJunitLibraryAccessors(owner);

        public OrgJunitPlatformLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.junit.platform.junit</b>
         */
        public OrgJunitPlatformJunitLibraryAccessors getJunit() {
            return laccForOrgJunitPlatformJunitLibraryAccessors;
        }

    }

    public static class OrgJunitPlatformJunitLibraryAccessors extends SubDependencyFactory {
        private final OrgJunitPlatformJunitPlatformLibraryAccessors laccForOrgJunitPlatformJunitPlatformLibraryAccessors = new OrgJunitPlatformJunitPlatformLibraryAccessors(owner);

        public OrgJunitPlatformJunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.junit.platform.junit.platform</b>
         */
        public OrgJunitPlatformJunitPlatformLibraryAccessors getPlatform() {
            return laccForOrgJunitPlatformJunitPlatformLibraryAccessors;
        }

    }

    public static class OrgJunitPlatformJunitPlatformLibraryAccessors extends SubDependencyFactory {

        public OrgJunitPlatformJunitPlatformLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>launcher</b> with <b>org.junit.platform:junit-platform-launcher</b> coordinates and
         * with version reference <b>org.junit.platform.junit.platform.launcher</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLauncher() {
            return create("org.junit.platform.junit.platform.launcher");
        }

    }

    public static class OrgLiquibaseLibraryAccessors extends SubDependencyFactory {
        private final OrgLiquibaseLiquibaseLibraryAccessors laccForOrgLiquibaseLiquibaseLibraryAccessors = new OrgLiquibaseLiquibaseLibraryAccessors(owner);

        public OrgLiquibaseLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.liquibase.liquibase</b>
         */
        public OrgLiquibaseLiquibaseLibraryAccessors getLiquibase() {
            return laccForOrgLiquibaseLiquibaseLibraryAccessors;
        }

    }

    public static class OrgLiquibaseLiquibaseLibraryAccessors extends SubDependencyFactory {

        public OrgLiquibaseLiquibaseLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>org.liquibase:liquibase-core</b> coordinates and
         * with version reference <b>org.liquibase.liquibase.core</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("org.liquibase.liquibase.core");
        }

    }

    public static class OrgLz4LibraryAccessors extends SubDependencyFactory {
        private final OrgLz4Lz4LibraryAccessors laccForOrgLz4Lz4LibraryAccessors = new OrgLz4Lz4LibraryAccessors(owner);

        public OrgLz4LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.lz4.lz4</b>
         */
        public OrgLz4Lz4LibraryAccessors getLz4() {
            return laccForOrgLz4Lz4LibraryAccessors;
        }

    }

    public static class OrgLz4Lz4LibraryAccessors extends SubDependencyFactory {

        public OrgLz4Lz4LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>java</b> with <b>org.lz4:lz4-java</b> coordinates and
         * with version reference <b>org.lz4.java</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJava() {
            return create("org.lz4.lz4.java");
        }

    }

    public static class OrgMockLibraryAccessors extends SubDependencyFactory {
        private final OrgMockServerLibraryAccessors laccForOrgMockServerLibraryAccessors = new OrgMockServerLibraryAccessors(owner);

        public OrgMockLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.mock.server</b>
         */
        public OrgMockServerLibraryAccessors getServer() {
            return laccForOrgMockServerLibraryAccessors;
        }

    }

    public static class OrgMockServerLibraryAccessors extends SubDependencyFactory {
        private final OrgMockServerMockserverLibraryAccessors laccForOrgMockServerMockserverLibraryAccessors = new OrgMockServerMockserverLibraryAccessors(owner);

        public OrgMockServerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.mock.server.mockserver</b>
         */
        public OrgMockServerMockserverLibraryAccessors getMockserver() {
            return laccForOrgMockServerMockserverLibraryAccessors;
        }

    }

    public static class OrgMockServerMockserverLibraryAccessors extends SubDependencyFactory {

        public OrgMockServerMockserverLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>org.mock-server:mockserver-core</b> coordinates and
         * with version reference <b>org.mock.server.mockserver.netty</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("org.mock.server.mockserver.core");
        }

        /**
         * Dependency provider for <b>netty</b> with <b>org.mock-server:mockserver-netty</b> coordinates and
         * with version reference <b>org.mock.server.mockserver.netty</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getNetty() {
            return create("org.mock.server.mockserver.netty");
        }

    }

    public static class OrgMockitoLibraryAccessors extends SubDependencyFactory {
        private final OrgMockitoKotlinLibraryAccessors laccForOrgMockitoKotlinLibraryAccessors = new OrgMockitoKotlinLibraryAccessors(owner);
        private final OrgMockitoMockitoLibraryAccessors laccForOrgMockitoMockitoLibraryAccessors = new OrgMockitoMockitoLibraryAccessors(owner);

        public OrgMockitoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.mockito.kotlin</b>
         */
        public OrgMockitoKotlinLibraryAccessors getKotlin() {
            return laccForOrgMockitoKotlinLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.mockito.mockito</b>
         */
        public OrgMockitoMockitoLibraryAccessors getMockito() {
            return laccForOrgMockitoMockitoLibraryAccessors;
        }

    }

    public static class OrgMockitoKotlinLibraryAccessors extends SubDependencyFactory {
        private final OrgMockitoKotlinMockitoLibraryAccessors laccForOrgMockitoKotlinMockitoLibraryAccessors = new OrgMockitoKotlinMockitoLibraryAccessors(owner);

        public OrgMockitoKotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.mockito.kotlin.mockito</b>
         */
        public OrgMockitoKotlinMockitoLibraryAccessors getMockito() {
            return laccForOrgMockitoKotlinMockitoLibraryAccessors;
        }

    }

    public static class OrgMockitoKotlinMockitoLibraryAccessors extends SubDependencyFactory {

        public OrgMockitoKotlinMockitoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>kotlin</b> with <b>org.mockito.kotlin:mockito-kotlin</b> coordinates and
         * with version reference <b>org.mockito.kotlin.mockito.kotlin</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKotlin() {
            return create("org.mockito.kotlin.mockito.kotlin");
        }

    }

    public static class OrgMockitoMockitoLibraryAccessors extends SubDependencyFactory {
        private final OrgMockitoMockitoJunitLibraryAccessors laccForOrgMockitoMockitoJunitLibraryAccessors = new OrgMockitoMockitoJunitLibraryAccessors(owner);

        public OrgMockitoMockitoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>org.mockito:mockito-core</b> coordinates and
         * with version reference <b>mockito.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("org.mockito.mockito.core");
        }

        /**
         * Dependency provider for <b>inline</b> with <b>org.mockito:mockito-inline</b> coordinates and
         * with version reference <b>org.mockito.mockito.inline</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getInline() {
            return create("org.mockito.mockito.inline");
        }

        /**
         * Group of libraries at <b>org.mockito.mockito.junit</b>
         */
        public OrgMockitoMockitoJunitLibraryAccessors getJunit() {
            return laccForOrgMockitoMockitoJunitLibraryAccessors;
        }

    }

    public static class OrgMockitoMockitoJunitLibraryAccessors extends SubDependencyFactory {

        public OrgMockitoMockitoJunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jupiter</b> with <b>org.mockito:mockito-junit-jupiter</b> coordinates and
         * with version reference <b>mockito.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJupiter() {
            return create("org.mockito.mockito.junit.jupiter");
        }

    }

    public static class OrgPostgresqlLibraryAccessors extends SubDependencyFactory {

        public OrgPostgresqlLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>postgresql</b> with <b>org.postgresql:postgresql</b> coordinates and
         * with version reference <b>org.postgresql.postgresql</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPostgresql() {
            return create("org.postgresql.postgresql");
        }

    }

    public static class OrgSpringdocLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringdocSpringdocLibraryAccessors laccForOrgSpringdocSpringdocLibraryAccessors = new OrgSpringdocSpringdocLibraryAccessors(owner);

        public OrgSpringdocLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.springdoc.springdoc</b>
         */
        public OrgSpringdocSpringdocLibraryAccessors getSpringdoc() {
            return laccForOrgSpringdocSpringdocLibraryAccessors;
        }

    }

    public static class OrgSpringdocSpringdocLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringdocSpringdocOpenapiLibraryAccessors laccForOrgSpringdocSpringdocOpenapiLibraryAccessors = new OrgSpringdocSpringdocOpenapiLibraryAccessors(owner);

        public OrgSpringdocSpringdocLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.springdoc.springdoc.openapi</b>
         */
        public OrgSpringdocSpringdocOpenapiLibraryAccessors getOpenapi() {
            return laccForOrgSpringdocSpringdocOpenapiLibraryAccessors;
        }

    }

    public static class OrgSpringdocSpringdocOpenapiLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringdocSpringdocOpenapiStarterLibraryAccessors laccForOrgSpringdocSpringdocOpenapiStarterLibraryAccessors = new OrgSpringdocSpringdocOpenapiStarterLibraryAccessors(owner);

        public OrgSpringdocSpringdocOpenapiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.springdoc.springdoc.openapi.starter</b>
         */
        public OrgSpringdocSpringdocOpenapiStarterLibraryAccessors getStarter() {
            return laccForOrgSpringdocSpringdocOpenapiStarterLibraryAccessors;
        }

    }

    public static class OrgSpringdocSpringdocOpenapiStarterLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringdocSpringdocOpenapiStarterWebLibraryAccessors laccForOrgSpringdocSpringdocOpenapiStarterWebLibraryAccessors = new OrgSpringdocSpringdocOpenapiStarterWebLibraryAccessors(owner);
        private final OrgSpringdocSpringdocOpenapiStarterWebfluxLibraryAccessors laccForOrgSpringdocSpringdocOpenapiStarterWebfluxLibraryAccessors = new OrgSpringdocSpringdocOpenapiStarterWebfluxLibraryAccessors(owner);

        public OrgSpringdocSpringdocOpenapiStarterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.springdoc.springdoc.openapi.starter.web</b>
         */
        public OrgSpringdocSpringdocOpenapiStarterWebLibraryAccessors getWeb() {
            return laccForOrgSpringdocSpringdocOpenapiStarterWebLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.springdoc.springdoc.openapi.starter.webflux</b>
         */
        public OrgSpringdocSpringdocOpenapiStarterWebfluxLibraryAccessors getWebflux() {
            return laccForOrgSpringdocSpringdocOpenapiStarterWebfluxLibraryAccessors;
        }

    }

    public static class OrgSpringdocSpringdocOpenapiStarterWebLibraryAccessors extends SubDependencyFactory {

        public OrgSpringdocSpringdocOpenapiStarterWebLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>ui</b> with <b>org.springdoc:springdoc-openapi-starter-webmvc-ui</b> coordinates and
         * with version reference <b>org.springdoc.springdoc.openapi.starter.ui</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getUi() {
            return create("org.springdoc.springdoc.openapi.starter.web.ui");
        }

    }

    public static class OrgSpringdocSpringdocOpenapiStarterWebfluxLibraryAccessors extends SubDependencyFactory {

        public OrgSpringdocSpringdocOpenapiStarterWebfluxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>ui</b> with <b>org.springdoc:springdoc-openapi-starter-webflux-ui</b> coordinates and
         * with version reference <b>org.springdoc.springdoc.openapi.starter.ui</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getUi() {
            return create("org.springdoc.springdoc.openapi.starter.webflux.ui");
        }

    }

    public static class OrgSpringframeworkLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkBootLibraryAccessors laccForOrgSpringframeworkBootLibraryAccessors = new OrgSpringframeworkBootLibraryAccessors(owner);
        private final OrgSpringframeworkDataLibraryAccessors laccForOrgSpringframeworkDataLibraryAccessors = new OrgSpringframeworkDataLibraryAccessors(owner);
        private final OrgSpringframeworkKafkaLibraryAccessors laccForOrgSpringframeworkKafkaLibraryAccessors = new OrgSpringframeworkKafkaLibraryAccessors(owner);
        private final OrgSpringframeworkSpringLibraryAccessors laccForOrgSpringframeworkSpringLibraryAccessors = new OrgSpringframeworkSpringLibraryAccessors(owner);

        public OrgSpringframeworkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jdbc</b> with <b>org.springframework:spring-jdbc</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJdbc() {
            return create("org.springframework.jdbc");
        }

        /**
         * Group of libraries at <b>org.springframework.boot</b>
         */
        public OrgSpringframeworkBootLibraryAccessors getBoot() {
            return laccForOrgSpringframeworkBootLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.springframework.data</b>
         */
        public OrgSpringframeworkDataLibraryAccessors getData() {
            return laccForOrgSpringframeworkDataLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.springframework.kafka</b>
         */
        public OrgSpringframeworkKafkaLibraryAccessors getKafka() {
            return laccForOrgSpringframeworkKafkaLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.springframework.spring</b>
         */
        public OrgSpringframeworkSpringLibraryAccessors getSpring() {
            return laccForOrgSpringframeworkSpringLibraryAccessors;
        }

    }

    public static class OrgSpringframeworkBootLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkBootSpringLibraryAccessors laccForOrgSpringframeworkBootSpringLibraryAccessors = new OrgSpringframeworkBootSpringLibraryAccessors(owner);

        public OrgSpringframeworkBootLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>bom</b> with <b>org.springframework.boot:spring-boot-dependencies</b> coordinates and
         * with version reference <b>spring.boot.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getBom() {
            return create("org.springframework.boot.bom");
        }

        /**
         * Group of libraries at <b>org.springframework.boot.spring</b>
         */
        public OrgSpringframeworkBootSpringLibraryAccessors getSpring() {
            return laccForOrgSpringframeworkBootSpringLibraryAccessors;
        }

    }

    public static class OrgSpringframeworkBootSpringLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkBootSpringBootLibraryAccessors laccForOrgSpringframeworkBootSpringBootLibraryAccessors = new OrgSpringframeworkBootSpringBootLibraryAccessors(owner);

        public OrgSpringframeworkBootSpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.springframework.boot.spring.boot</b>
         */
        public OrgSpringframeworkBootSpringBootLibraryAccessors getBoot() {
            return laccForOrgSpringframeworkBootSpringBootLibraryAccessors;
        }

    }

    public static class OrgSpringframeworkBootSpringBootLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final OrgSpringframeworkBootSpringBootStarterLibraryAccessors laccForOrgSpringframeworkBootSpringBootStarterLibraryAccessors = new OrgSpringframeworkBootSpringBootStarterLibraryAccessors(owner);

        public OrgSpringframeworkBootSpringBootLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>boot</b> with <b>org.springframework.boot:spring-boot</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("org.springframework.boot.spring.boot");
        }

        /**
         * Dependency provider for <b>autoconfigure</b> with <b>org.springframework.boot:spring-boot-autoconfigure</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAutoconfigure() {
            return create("org.springframework.boot.spring.boot.autoconfigure");
        }

        /**
         * Group of libraries at <b>org.springframework.boot.spring.boot.starter</b>
         */
        public OrgSpringframeworkBootSpringBootStarterLibraryAccessors getStarter() {
            return laccForOrgSpringframeworkBootSpringBootStarterLibraryAccessors;
        }

    }

    public static class OrgSpringframeworkBootSpringBootStarterLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final OrgSpringframeworkBootSpringBootStarterDataLibraryAccessors laccForOrgSpringframeworkBootSpringBootStarterDataLibraryAccessors = new OrgSpringframeworkBootSpringBootStarterDataLibraryAccessors(owner);

        public OrgSpringframeworkBootSpringBootStarterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>starter</b> with <b>org.springframework.boot:spring-boot-starter</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("org.springframework.boot.spring.boot.starter");
        }

        /**
         * Dependency provider for <b>actuator</b> with <b>org.springframework.boot:spring-boot-starter-actuator</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getActuator() {
            return create("org.springframework.boot.spring.boot.starter.actuator");
        }

        /**
         * Dependency provider for <b>aop</b> with <b>org.springframework.boot:spring-boot-starter-aop</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAop() {
            return create("org.springframework.boot.spring.boot.starter.aop");
        }

        /**
         * Dependency provider for <b>cache</b> with <b>org.springframework.boot:spring-boot-starter-cache</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCache() {
            return create("org.springframework.boot.spring.boot.starter.cache");
        }

        /**
         * Dependency provider for <b>json</b> with <b>org.springframework.boot:spring-boot-starter-json</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJson() {
            return create("org.springframework.boot.spring.boot.starter.json");
        }

        /**
         * Dependency provider for <b>test</b> with <b>org.springframework.boot:spring-boot-starter-test</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTest() {
            return create("org.springframework.boot.spring.boot.starter.test");
        }

        /**
         * Dependency provider for <b>validation</b> with <b>org.springframework.boot:spring-boot-starter-validation</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getValidation() {
            return create("org.springframework.boot.spring.boot.starter.validation");
        }

        /**
         * Dependency provider for <b>web</b> with <b>org.springframework.boot:spring-boot-starter-web</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getWeb() {
            return create("org.springframework.boot.spring.boot.starter.web");
        }

        /**
         * Dependency provider for <b>webflux</b> with <b>org.springframework.boot:spring-boot-starter-webflux</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getWebflux() {
            return create("org.springframework.boot.spring.boot.starter.webflux");
        }

        /**
         * Group of libraries at <b>org.springframework.boot.spring.boot.starter.data</b>
         */
        public OrgSpringframeworkBootSpringBootStarterDataLibraryAccessors getData() {
            return laccForOrgSpringframeworkBootSpringBootStarterDataLibraryAccessors;
        }

    }

    public static class OrgSpringframeworkBootSpringBootStarterDataLibraryAccessors extends SubDependencyFactory {

        public OrgSpringframeworkBootSpringBootStarterDataLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jdbc</b> with <b>org.springframework.boot:spring-boot-starter-data-jdbc</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJdbc() {
            return create("org.springframework.boot.spring.boot.starter.data.jdbc");
        }

    }

    public static class OrgSpringframeworkDataLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkDataSpringLibraryAccessors laccForOrgSpringframeworkDataSpringLibraryAccessors = new OrgSpringframeworkDataSpringLibraryAccessors(owner);

        public OrgSpringframeworkDataLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.springframework.data.spring</b>
         */
        public OrgSpringframeworkDataSpringLibraryAccessors getSpring() {
            return laccForOrgSpringframeworkDataSpringLibraryAccessors;
        }

    }

    public static class OrgSpringframeworkDataSpringLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkDataSpringDataLibraryAccessors laccForOrgSpringframeworkDataSpringDataLibraryAccessors = new OrgSpringframeworkDataSpringDataLibraryAccessors(owner);

        public OrgSpringframeworkDataSpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.springframework.data.spring.data</b>
         */
        public OrgSpringframeworkDataSpringDataLibraryAccessors getData() {
            return laccForOrgSpringframeworkDataSpringDataLibraryAccessors;
        }

    }

    public static class OrgSpringframeworkDataSpringDataLibraryAccessors extends SubDependencyFactory {

        public OrgSpringframeworkDataSpringDataLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>commons</b> with <b>org.springframework.data:spring-data-commons</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCommons() {
            return create("org.springframework.data.spring.data.commons");
        }

        /**
         * Dependency provider for <b>relational</b> with <b>org.springframework.data:spring-data-relational</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRelational() {
            return create("org.springframework.data.spring.data.relational");
        }

    }

    public static class OrgSpringframeworkKafkaLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkKafkaSpringLibraryAccessors laccForOrgSpringframeworkKafkaSpringLibraryAccessors = new OrgSpringframeworkKafkaSpringLibraryAccessors(owner);

        public OrgSpringframeworkKafkaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.springframework.kafka.spring</b>
         */
        public OrgSpringframeworkKafkaSpringLibraryAccessors getSpring() {
            return laccForOrgSpringframeworkKafkaSpringLibraryAccessors;
        }

    }

    public static class OrgSpringframeworkKafkaSpringLibraryAccessors extends SubDependencyFactory {

        public OrgSpringframeworkKafkaSpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>kafka</b> with <b>org.springframework.kafka:spring-kafka</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKafka() {
            return create("org.springframework.kafka.spring.kafka");
        }

    }

    public static class OrgSpringframeworkSpringLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkSpringContextLibraryAccessors laccForOrgSpringframeworkSpringContextLibraryAccessors = new OrgSpringframeworkSpringContextLibraryAccessors(owner);

        public OrgSpringframeworkSpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>org.springframework:spring-core</b> coordinates and
         * with version reference <b>spring.framework.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("org.springframework.spring.core");
        }

        /**
         * Dependency provider for <b>retry</b> with <b>org.springframework.retry:spring-retry</b> coordinates and
         * with version reference <b>spring.retry.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRetry() {
            return create("org.springframework.spring.retry");
        }

        /**
         * Dependency provider for <b>tx</b> with <b>org.springframework:spring-tx</b> coordinates and
         * with version reference <b>spring.framework.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTx() {
            return create("org.springframework.spring.tx");
        }

        /**
         * Dependency provider for <b>web</b> with <b>org.springframework:spring-web</b> coordinates and
         * with version reference <b>spring.framework.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getWeb() {
            return create("org.springframework.spring.web");
        }

        /**
         * Group of libraries at <b>org.springframework.spring.context</b>
         */
        public OrgSpringframeworkSpringContextLibraryAccessors getContext() {
            return laccForOrgSpringframeworkSpringContextLibraryAccessors;
        }

    }

    public static class OrgSpringframeworkSpringContextLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public OrgSpringframeworkSpringContextLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>context</b> with <b>org.springframework:spring-context</b> coordinates and
         * with version reference <b>spring.framework.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("org.springframework.spring.context");
        }

        /**
         * Dependency provider for <b>support</b> with <b>org.springframework:spring-context-support</b> coordinates and
         * with version reference <b>spring.framework.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSupport() {
            return create("org.springframework.spring.context.support");
        }

    }

    public static class OrgTestcontainersLibraryAccessors extends SubDependencyFactory {
        private final OrgTestcontainersJunitLibraryAccessors laccForOrgTestcontainersJunitLibraryAccessors = new OrgTestcontainersJunitLibraryAccessors(owner);

        public OrgTestcontainersLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>cassandra</b> with <b>org.testcontainers:cassandra</b> coordinates and
         * with version reference <b>org.testcontainers</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCassandra() {
            return create("org.testcontainers.cassandra");
        }

        /**
         * Dependency provider for <b>clickhouse</b> with <b>org.testcontainers:clickhouse</b> coordinates and
         * with version reference <b>org.testcontainers</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getClickhouse() {
            return create("org.testcontainers.clickhouse");
        }

        /**
         * Dependency provider for <b>jdbc</b> with <b>org.testcontainers:jdbc</b> coordinates and
         * with version reference <b>org.testcontainers</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJdbc() {
            return create("org.testcontainers.jdbc");
        }

        /**
         * Dependency provider for <b>kafka</b> with <b>org.testcontainers:kafka</b> coordinates and
         * with version reference <b>org.testcontainers</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKafka() {
            return create("org.testcontainers.kafka");
        }

        /**
         * Dependency provider for <b>minio</b> with <b>org.testcontainers:minio</b> coordinates and
         * with version reference <b>org.testcontainers</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMinio() {
            return create("org.testcontainers.minio");
        }

        /**
         * Dependency provider for <b>mockserver</b> with <b>org.testcontainers:mockserver</b> coordinates and
         * with version reference <b>org.testcontainers</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMockserver() {
            return create("org.testcontainers.mockserver");
        }

        /**
         * Dependency provider for <b>postgresql</b> with <b>org.testcontainers:postgresql</b> coordinates and
         * with version reference <b>org.testcontainers</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPostgresql() {
            return create("org.testcontainers.postgresql");
        }

        /**
         * Dependency provider for <b>testcontainers</b> with <b>org.testcontainers:testcontainers</b> coordinates and
         * with version reference <b>org.testcontainers</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTestcontainers() {
            return create("org.testcontainers.testcontainers");
        }

        /**
         * Group of libraries at <b>org.testcontainers.junit</b>
         */
        public OrgTestcontainersJunitLibraryAccessors getJunit() {
            return laccForOrgTestcontainersJunitLibraryAccessors;
        }

    }

    public static class OrgTestcontainersJunitLibraryAccessors extends SubDependencyFactory {

        public OrgTestcontainersJunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jupiter</b> with <b>org.testcontainers:junit-jupiter</b> coordinates and
         * with version reference <b>org.testcontainers</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJupiter() {
            return create("org.testcontainers.junit.jupiter");
        }

    }

    public static class S3LibraryAccessors extends SubDependencyFactory {
        private final S3AwsLibraryAccessors laccForS3AwsLibraryAccessors = new S3AwsLibraryAccessors(owner);

        public S3LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>s3.aws</b>
         */
        public S3AwsLibraryAccessors getAws() {
            return laccForS3AwsLibraryAccessors;
        }

    }

    public static class S3AwsLibraryAccessors extends SubDependencyFactory {

        public S3AwsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>sdk</b> with <b>software.amazon.awssdk:s3</b> coordinates and
         * with version reference <b>aws.s3.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSdk() {
            return create("s3.aws.sdk");
        }

    }

    public static class ShedlockLibraryAccessors extends SubDependencyFactory {
        private final ShedlockProviderLibraryAccessors laccForShedlockProviderLibraryAccessors = new ShedlockProviderLibraryAccessors(owner);

        public ShedlockLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>spring</b> with <b>net.javacrumbs.shedlock:shedlock-spring</b> coordinates and
         * with version reference <b>shedlock.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSpring() {
            return create("shedlock.spring");
        }

        /**
         * Group of libraries at <b>shedlock.provider</b>
         */
        public ShedlockProviderLibraryAccessors getProvider() {
            return laccForShedlockProviderLibraryAccessors;
        }

    }

    public static class ShedlockProviderLibraryAccessors extends SubDependencyFactory {

        public ShedlockProviderLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jdbc</b> with <b>net.javacrumbs.shedlock:shedlock-provider-jdbc-template</b> coordinates and
         * with version reference <b>shedlock.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJdbc() {
            return create("shedlock.provider.jdbc");
        }

    }

    public static class SoftwareLibraryAccessors extends SubDependencyFactory {
        private final SoftwareAmazonLibraryAccessors laccForSoftwareAmazonLibraryAccessors = new SoftwareAmazonLibraryAccessors(owner);

        public SoftwareLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>software.amazon</b>
         */
        public SoftwareAmazonLibraryAccessors getAmazon() {
            return laccForSoftwareAmazonLibraryAccessors;
        }

    }

    public static class SoftwareAmazonLibraryAccessors extends SubDependencyFactory {
        private final SoftwareAmazonAwssdkLibraryAccessors laccForSoftwareAmazonAwssdkLibraryAccessors = new SoftwareAmazonAwssdkLibraryAccessors(owner);

        public SoftwareAmazonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>software.amazon.awssdk</b>
         */
        public SoftwareAmazonAwssdkLibraryAccessors getAwssdk() {
            return laccForSoftwareAmazonAwssdkLibraryAccessors;
        }

    }

    public static class SoftwareAmazonAwssdkLibraryAccessors extends SubDependencyFactory {
        private final SoftwareAmazonAwssdkNettyLibraryAccessors laccForSoftwareAmazonAwssdkNettyLibraryAccessors = new SoftwareAmazonAwssdkNettyLibraryAccessors(owner);

        public SoftwareAmazonAwssdkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>s3</b> with <b>software.amazon.awssdk:s3</b> coordinates and
         * with version reference <b>amazon.awssdk.s3</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getS3() {
            return create("software.amazon.awssdk.s3");
        }

        /**
         * Group of libraries at <b>software.amazon.awssdk.netty</b>
         */
        public SoftwareAmazonAwssdkNettyLibraryAccessors getNetty() {
            return laccForSoftwareAmazonAwssdkNettyLibraryAccessors;
        }

    }

    public static class SoftwareAmazonAwssdkNettyLibraryAccessors extends SubDependencyFactory {
        private final SoftwareAmazonAwssdkNettyNioLibraryAccessors laccForSoftwareAmazonAwssdkNettyNioLibraryAccessors = new SoftwareAmazonAwssdkNettyNioLibraryAccessors(owner);

        public SoftwareAmazonAwssdkNettyLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>software.amazon.awssdk.netty.nio</b>
         */
        public SoftwareAmazonAwssdkNettyNioLibraryAccessors getNio() {
            return laccForSoftwareAmazonAwssdkNettyNioLibraryAccessors;
        }

    }

    public static class SoftwareAmazonAwssdkNettyNioLibraryAccessors extends SubDependencyFactory {

        public SoftwareAmazonAwssdkNettyNioLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>client</b> with <b>software.amazon.awssdk:netty-nio-client</b> coordinates and
         * with version reference <b>amazon.awssdk.s3</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getClient() {
            return create("software.amazon.awssdk.netty.nio.client");
        }

    }

    public static class SpringLibraryAccessors extends SubDependencyFactory {
        private final SpringBootLibraryAccessors laccForSpringBootLibraryAccessors = new SpringBootLibraryAccessors(owner);
        private final SpringCloudLibraryAccessors laccForSpringCloudLibraryAccessors = new SpringCloudLibraryAccessors(owner);
        private final SpringDataLibraryAccessors laccForSpringDataLibraryAccessors = new SpringDataLibraryAccessors(owner);
        private final SpringOpenapiLibraryAccessors laccForSpringOpenapiLibraryAccessors = new SpringOpenapiLibraryAccessors(owner);

        public SpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>webflux</b> with <b>org.springframework:spring-webflux</b> coordinates and
         * with version reference <b>spring.framework.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getWebflux() {
            return create("spring.webflux");
        }

        /**
         * Group of libraries at <b>spring.boot</b>
         */
        public SpringBootLibraryAccessors getBoot() {
            return laccForSpringBootLibraryAccessors;
        }

        /**
         * Group of libraries at <b>spring.cloud</b>
         */
        public SpringCloudLibraryAccessors getCloud() {
            return laccForSpringCloudLibraryAccessors;
        }

        /**
         * Group of libraries at <b>spring.data</b>
         */
        public SpringDataLibraryAccessors getData() {
            return laccForSpringDataLibraryAccessors;
        }

        /**
         * Group of libraries at <b>spring.openapi</b>
         */
        public SpringOpenapiLibraryAccessors getOpenapi() {
            return laccForSpringOpenapiLibraryAccessors;
        }

    }

    public static class SpringBootLibraryAccessors extends SubDependencyFactory {
        private final SpringBootConfigurationLibraryAccessors laccForSpringBootConfigurationLibraryAccessors = new SpringBootConfigurationLibraryAccessors(owner);
        private final SpringBootStarterLibraryAccessors laccForSpringBootStarterLibraryAccessors = new SpringBootStarterLibraryAccessors(owner);

        public SpringBootLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>spring.boot.configuration</b>
         */
        public SpringBootConfigurationLibraryAccessors getConfiguration() {
            return laccForSpringBootConfigurationLibraryAccessors;
        }

        /**
         * Group of libraries at <b>spring.boot.starter</b>
         */
        public SpringBootStarterLibraryAccessors getStarter() {
            return laccForSpringBootStarterLibraryAccessors;
        }

    }

    public static class SpringBootConfigurationLibraryAccessors extends SubDependencyFactory {
        private final SpringBootConfigurationAnnotationLibraryAccessors laccForSpringBootConfigurationAnnotationLibraryAccessors = new SpringBootConfigurationAnnotationLibraryAccessors(owner);

        public SpringBootConfigurationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>spring.boot.configuration.annotation</b>
         */
        public SpringBootConfigurationAnnotationLibraryAccessors getAnnotation() {
            return laccForSpringBootConfigurationAnnotationLibraryAccessors;
        }

    }

    public static class SpringBootConfigurationAnnotationLibraryAccessors extends SubDependencyFactory {

        public SpringBootConfigurationAnnotationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>processor</b> with <b>org.springframework.boot:spring-boot-configuration-processor</b> coordinates and
         * with version reference <b>spring.boot.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getProcessor() {
            return create("spring.boot.configuration.annotation.processor");
        }

    }

    public static class SpringBootStarterLibraryAccessors extends SubDependencyFactory {

        public SpringBootStarterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jdbc</b> with <b>org.springframework.boot:spring-boot-starter-jdbc</b> coordinates and
         * with version reference <b>spring.boot.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJdbc() {
            return create("spring.boot.starter.jdbc");
        }

    }

    public static class SpringCloudLibraryAccessors extends SubDependencyFactory {
        private final SpringCloudContractLibraryAccessors laccForSpringCloudContractLibraryAccessors = new SpringCloudContractLibraryAccessors(owner);
        private final SpringCloudFeignLibraryAccessors laccForSpringCloudFeignLibraryAccessors = new SpringCloudFeignLibraryAccessors(owner);
        private final SpringCloudStarterLibraryAccessors laccForSpringCloudStarterLibraryAccessors = new SpringCloudStarterLibraryAccessors(owner);

        public SpringCloudLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>spring.cloud.contract</b>
         */
        public SpringCloudContractLibraryAccessors getContract() {
            return laccForSpringCloudContractLibraryAccessors;
        }

        /**
         * Group of libraries at <b>spring.cloud.feign</b>
         */
        public SpringCloudFeignLibraryAccessors getFeign() {
            return laccForSpringCloudFeignLibraryAccessors;
        }

        /**
         * Group of libraries at <b>spring.cloud.starter</b>
         */
        public SpringCloudStarterLibraryAccessors getStarter() {
            return laccForSpringCloudStarterLibraryAccessors;
        }

    }

    public static class SpringCloudContractLibraryAccessors extends SubDependencyFactory {

        public SpringCloudContractLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>wiremock</b> with <b>org.springframework.cloud:spring-cloud-contract-wiremock</b> coordinates and
         * with version reference <b>spring.cloud.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getWiremock() {
            return create("spring.cloud.contract.wiremock");
        }

    }

    public static class SpringCloudFeignLibraryAccessors extends SubDependencyFactory {

        public SpringCloudFeignLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>okhttp</b> with <b>io.github.openfeign:feign-okhttp</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getOkhttp() {
            return create("spring.cloud.feign.okhttp");
        }

    }

    public static class SpringCloudStarterLibraryAccessors extends SubDependencyFactory {

        public SpringCloudStarterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>gateway</b> with <b>org.springframework.cloud:spring-cloud-starter-gateway</b> coordinates and
         * with version reference <b>spring.cloud.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGateway() {
            return create("spring.cloud.starter.gateway");
        }

        /**
         * Dependency provider for <b>loadbalancer</b> with <b>org.springframework.cloud:spring-cloud-starter-loadbalancer</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLoadbalancer() {
            return create("spring.cloud.starter.loadbalancer");
        }

        /**
         * Dependency provider for <b>openfeign</b> with <b>org.springframework.cloud:spring-cloud-starter-openfeign</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getOpenfeign() {
            return create("spring.cloud.starter.openfeign");
        }

    }

    public static class SpringDataLibraryAccessors extends SubDependencyFactory {
        private final SpringDataJpaLibraryAccessors laccForSpringDataJpaLibraryAccessors = new SpringDataJpaLibraryAccessors(owner);

        public SpringDataLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>spring.data.jpa</b>
         */
        public SpringDataJpaLibraryAccessors getJpa() {
            return laccForSpringDataJpaLibraryAccessors;
        }

    }

    public static class SpringDataJpaLibraryAccessors extends SubDependencyFactory {

        public SpringDataJpaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>starter</b> with <b>org.springframework.boot:spring-boot-starter-data-jpa</b> coordinates and
         * with version reference <b>spring.boot.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getStarter() {
            return create("spring.data.jpa.starter");
        }

    }

    public static class SpringOpenapiLibraryAccessors extends SubDependencyFactory {

        public SpringOpenapiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>common</b> with <b>org.springdoc:springdoc-openapi-starter-common</b> coordinates and
         * with version reference <b>spring.doc.openapi.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCommon() {
            return create("spring.openapi.common");
        }

        /**
         * Dependency provider for <b>ui</b> with <b>org.springdoc:springdoc-openapi-starter-webmvc-ui</b> coordinates and
         * with version reference <b>spring.doc.openapi.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getUi() {
            return create("spring.openapi.ui");
        }

    }

    public static class TestcontainersLibraryAccessors extends SubDependencyFactory {

        public TestcontainersLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>bom</b> with <b>org.testcontainers:testcontainers-bom</b> coordinates and
         * with version reference <b>org.testcontainers</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getBom() {
            return create("testcontainers.bom");
        }

    }

    public static class TomcatLibraryAccessors extends SubDependencyFactory {
        private final TomcatEmbedLibraryAccessors laccForTomcatEmbedLibraryAccessors = new TomcatEmbedLibraryAccessors(owner);

        public TomcatLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>tomcat.embed</b>
         */
        public TomcatEmbedLibraryAccessors getEmbed() {
            return laccForTomcatEmbedLibraryAccessors;
        }

    }

    public static class TomcatEmbedLibraryAccessors extends SubDependencyFactory {

        public TomcatEmbedLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>org.apache.tomcat.embed:tomcat-embed-core</b> coordinates and
         * with version <b>10.1.34</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("tomcat.embed.core");
        }

    }

    public static class XmlunitLibraryAccessors extends SubDependencyFactory {

        public XmlunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>org.xmlunit:xmlunit-core</b> coordinates and
         * with version <b>2.10.0</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("xmlunit.core");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final AllureVersionAccessors vaccForAllureVersionAccessors = new AllureVersionAccessors(providers, config);
        private final AmazonVersionAccessors vaccForAmazonVersionAccessors = new AmazonVersionAccessors(providers, config);
        private final AwsVersionAccessors vaccForAwsVersionAccessors = new AwsVersionAccessors(providers, config);
        private final ComVersionAccessors vaccForComVersionAccessors = new ComVersionAccessors(providers, config);
        private final CommonsVersionAccessors vaccForCommonsVersionAccessors = new CommonsVersionAccessors(providers, config);
        private final CrptVersionAccessors vaccForCrptVersionAccessors = new CrptVersionAccessors(providers, config);
        private final EmbeddedVersionAccessors vaccForEmbeddedVersionAccessors = new EmbeddedVersionAccessors(providers, config);
        private final GuavaVersionAccessors vaccForGuavaVersionAccessors = new GuavaVersionAccessors(providers, config);
        private final HibernateVersionAccessors vaccForHibernateVersionAccessors = new HibernateVersionAccessors(providers, config);
        private final IoVersionAccessors vaccForIoVersionAccessors = new IoVersionAccessors(providers, config);
        private final JacksonVersionAccessors vaccForJacksonVersionAccessors = new JacksonVersionAccessors(providers, config);
        private final JakartaVersionAccessors vaccForJakartaVersionAccessors = new JakartaVersionAccessors(providers, config);
        private final JaxbVersionAccessors vaccForJaxbVersionAccessors = new JaxbVersionAccessors(providers, config);
        private final JunitVersionAccessors vaccForJunitVersionAccessors = new JunitVersionAccessors(providers, config);
        private final KotlinVersionAccessors vaccForKotlinVersionAccessors = new KotlinVersionAccessors(providers, config);
        private final LogbackVersionAccessors vaccForLogbackVersionAccessors = new LogbackVersionAccessors(providers, config);
        private final MapstructVersionAccessors vaccForMapstructVersionAccessors = new MapstructVersionAccessors(providers, config);
        private final MockitoVersionAccessors vaccForMockitoVersionAccessors = new MockitoVersionAccessors(providers, config);
        private final MockkVersionAccessors vaccForMockkVersionAccessors = new MockkVersionAccessors(providers, config);
        private final NetVersionAccessors vaccForNetVersionAccessors = new NetVersionAccessors(providers, config);
        private final OkhttpVersionAccessors vaccForOkhttpVersionAccessors = new OkhttpVersionAccessors(providers, config);
        private final OpentelemetryVersionAccessors vaccForOpentelemetryVersionAccessors = new OpentelemetryVersionAccessors(providers, config);
        private final OrgVersionAccessors vaccForOrgVersionAccessors = new OrgVersionAccessors(providers, config);
        private final PreliquibaseVersionAccessors vaccForPreliquibaseVersionAccessors = new PreliquibaseVersionAccessors(providers, config);
        private final ShedlockVersionAccessors vaccForShedlockVersionAccessors = new ShedlockVersionAccessors(providers, config);
        private final SpringVersionAccessors vaccForSpringVersionAccessors = new SpringVersionAccessors(providers, config);
        private final TemporalVersionAccessors vaccForTemporalVersionAccessors = new TemporalVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.allure</b>
         */
        public AllureVersionAccessors getAllure() {
            return vaccForAllureVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.amazon</b>
         */
        public AmazonVersionAccessors getAmazon() {
            return vaccForAmazonVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.aws</b>
         */
        public AwsVersionAccessors getAws() {
            return vaccForAwsVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.com</b>
         */
        public ComVersionAccessors getCom() {
            return vaccForComVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.commons</b>
         */
        public CommonsVersionAccessors getCommons() {
            return vaccForCommonsVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.crpt</b>
         */
        public CrptVersionAccessors getCrpt() {
            return vaccForCrptVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.embedded</b>
         */
        public EmbeddedVersionAccessors getEmbedded() {
            return vaccForEmbeddedVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.guava</b>
         */
        public GuavaVersionAccessors getGuava() {
            return vaccForGuavaVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.hibernate</b>
         */
        public HibernateVersionAccessors getHibernate() {
            return vaccForHibernateVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.io</b>
         */
        public IoVersionAccessors getIo() {
            return vaccForIoVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.jackson</b>
         */
        public JacksonVersionAccessors getJackson() {
            return vaccForJacksonVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.jakarta</b>
         */
        public JakartaVersionAccessors getJakarta() {
            return vaccForJakartaVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.jaxb</b>
         */
        public JaxbVersionAccessors getJaxb() {
            return vaccForJaxbVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.junit</b>
         */
        public JunitVersionAccessors getJunit() {
            return vaccForJunitVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.kotlin</b>
         */
        public KotlinVersionAccessors getKotlin() {
            return vaccForKotlinVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.logback</b>
         */
        public LogbackVersionAccessors getLogback() {
            return vaccForLogbackVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.mapstruct</b>
         */
        public MapstructVersionAccessors getMapstruct() {
            return vaccForMapstructVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.mockito</b>
         */
        public MockitoVersionAccessors getMockito() {
            return vaccForMockitoVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.mockk</b>
         */
        public MockkVersionAccessors getMockk() {
            return vaccForMockkVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.net</b>
         */
        public NetVersionAccessors getNet() {
            return vaccForNetVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.okhttp</b>
         */
        public OkhttpVersionAccessors getOkhttp() {
            return vaccForOkhttpVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.opentelemetry</b>
         */
        public OpentelemetryVersionAccessors getOpentelemetry() {
            return vaccForOpentelemetryVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org</b>
         */
        public OrgVersionAccessors getOrg() {
            return vaccForOrgVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.preliquibase</b>
         */
        public PreliquibaseVersionAccessors getPreliquibase() {
            return vaccForPreliquibaseVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.shedlock</b>
         */
        public ShedlockVersionAccessors getShedlock() {
            return vaccForShedlockVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.spring</b>
         */
        public SpringVersionAccessors getSpring() {
            return vaccForSpringVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.temporal</b>
         */
        public TemporalVersionAccessors getTemporal() {
            return vaccForTemporalVersionAccessors;
        }

    }

    public static class AllureVersionAccessors extends VersionFactory  {

        private final AllurePluginVersionAccessors vaccForAllurePluginVersionAccessors = new AllurePluginVersionAccessors(providers, config);
        public AllureVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>allure.version</b> with value <b>2.29.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("allure.version"); }

        /**
         * Group of versions at <b>versions.allure.plugin</b>
         */
        public AllurePluginVersionAccessors getPlugin() {
            return vaccForAllurePluginVersionAccessors;
        }

    }

    public static class AllurePluginVersionAccessors extends VersionFactory  {

        public AllurePluginVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>allure.plugin.version</b> with value <b>2.12.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("allure.plugin.version"); }

    }

    public static class AmazonVersionAccessors extends VersionFactory  {

        private final AmazonAwssdkVersionAccessors vaccForAmazonAwssdkVersionAccessors = new AmazonAwssdkVersionAccessors(providers, config);
        public AmazonVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.amazon.awssdk</b>
         */
        public AmazonAwssdkVersionAccessors getAwssdk() {
            return vaccForAmazonAwssdkVersionAccessors;
        }

    }

    public static class AmazonAwssdkVersionAccessors extends VersionFactory  {

        public AmazonAwssdkVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>amazon.awssdk.s3</b> with value <b>2.17.295</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getS3() { return getVersion("amazon.awssdk.s3"); }

    }

    public static class AwsVersionAccessors extends VersionFactory  {

        private final AwsS3VersionAccessors vaccForAwsS3VersionAccessors = new AwsS3VersionAccessors(providers, config);
        public AwsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.aws.s3</b>
         */
        public AwsS3VersionAccessors getS3() {
            return vaccForAwsS3VersionAccessors;
        }

    }

    public static class AwsS3VersionAccessors extends VersionFactory  {

        public AwsS3VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>aws.s3.version</b> with value <b>2.25.65</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("aws.s3.version"); }

    }

    public static class ComVersionAccessors extends VersionFactory  {

        private final ComClickhouseVersionAccessors vaccForComClickhouseVersionAccessors = new ComClickhouseVersionAccessors(providers, config);
        private final ComFasterxmlVersionAccessors vaccForComFasterxmlVersionAccessors = new ComFasterxmlVersionAccessors(providers, config);
        private final ComGithubVersionAccessors vaccForComGithubVersionAccessors = new ComGithubVersionAccessors(providers, config);
        private final ComGoogleVersionAccessors vaccForComGoogleVersionAccessors = new ComGoogleVersionAccessors(providers, config);
        private final ComZaxxerVersionAccessors vaccForComZaxxerVersionAccessors = new ComZaxxerVersionAccessors(providers, config);
        public ComVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.com.clickhouse</b>
         */
        public ComClickhouseVersionAccessors getClickhouse() {
            return vaccForComClickhouseVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.com.fasterxml</b>
         */
        public ComFasterxmlVersionAccessors getFasterxml() {
            return vaccForComFasterxmlVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.com.github</b>
         */
        public ComGithubVersionAccessors getGithub() {
            return vaccForComGithubVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.com.google</b>
         */
        public ComGoogleVersionAccessors getGoogle() {
            return vaccForComGoogleVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.com.zaxxer</b>
         */
        public ComZaxxerVersionAccessors getZaxxer() {
            return vaccForComZaxxerVersionAccessors;
        }

    }

    public static class ComClickhouseVersionAccessors extends VersionFactory  {

        public ComClickhouseVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>com.clickhouse.version</b> with value <b>0.9.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("com.clickhouse.version"); }

    }

    public static class ComFasterxmlVersionAccessors extends VersionFactory  {

        private final ComFasterxmlUuidVersionAccessors vaccForComFasterxmlUuidVersionAccessors = new ComFasterxmlUuidVersionAccessors(providers, config);
        public ComFasterxmlVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.com.fasterxml.uuid</b>
         */
        public ComFasterxmlUuidVersionAccessors getUuid() {
            return vaccForComFasterxmlUuidVersionAccessors;
        }

    }

    public static class ComFasterxmlUuidVersionAccessors extends VersionFactory  {

        private final ComFasterxmlUuidJavaVersionAccessors vaccForComFasterxmlUuidJavaVersionAccessors = new ComFasterxmlUuidJavaVersionAccessors(providers, config);
        public ComFasterxmlUuidVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.com.fasterxml.uuid.java</b>
         */
        public ComFasterxmlUuidJavaVersionAccessors getJava() {
            return vaccForComFasterxmlUuidJavaVersionAccessors;
        }

    }

    public static class ComFasterxmlUuidJavaVersionAccessors extends VersionFactory  {

        private final ComFasterxmlUuidJavaUuidVersionAccessors vaccForComFasterxmlUuidJavaUuidVersionAccessors = new ComFasterxmlUuidJavaUuidVersionAccessors(providers, config);
        public ComFasterxmlUuidJavaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.com.fasterxml.uuid.java.uuid</b>
         */
        public ComFasterxmlUuidJavaUuidVersionAccessors getUuid() {
            return vaccForComFasterxmlUuidJavaUuidVersionAccessors;
        }

    }

    public static class ComFasterxmlUuidJavaUuidVersionAccessors extends VersionFactory  {

        public ComFasterxmlUuidJavaUuidVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>com.fasterxml.uuid.java.uuid.generator</b> with value <b>4.0.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getGenerator() { return getVersion("com.fasterxml.uuid.java.uuid.generator"); }

    }

    public static class ComGithubVersionAccessors extends VersionFactory  {

        private final ComGithubBenVersionAccessors vaccForComGithubBenVersionAccessors = new ComGithubBenVersionAccessors(providers, config);
        private final ComGithubGrowthbookVersionAccessors vaccForComGithubGrowthbookVersionAccessors = new ComGithubGrowthbookVersionAccessors(providers, config);
        private final ComGithubIshugaliyVersionAccessors vaccForComGithubIshugaliyVersionAccessors = new ComGithubIshugaliyVersionAccessors(providers, config);
        private final ComGithubJsqlparserVersionAccessors vaccForComGithubJsqlparserVersionAccessors = new ComGithubJsqlparserVersionAccessors(providers, config);
        private final ComGithubLoki4jVersionAccessors vaccForComGithubLoki4jVersionAccessors = new ComGithubLoki4jVersionAccessors(providers, config);
        public ComGithubVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.com.github.ben</b>
         */
        public ComGithubBenVersionAccessors getBen() {
            return vaccForComGithubBenVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.com.github.growthbook</b>
         */
        public ComGithubGrowthbookVersionAccessors getGrowthbook() {
            return vaccForComGithubGrowthbookVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.com.github.ishugaliy</b>
         */
        public ComGithubIshugaliyVersionAccessors getIshugaliy() {
            return vaccForComGithubIshugaliyVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.com.github.jsqlparser</b>
         */
        public ComGithubJsqlparserVersionAccessors getJsqlparser() {
            return vaccForComGithubJsqlparserVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.com.github.loki4j</b>
         */
        public ComGithubLoki4jVersionAccessors getLoki4j() {
            return vaccForComGithubLoki4jVersionAccessors;
        }

    }

    public static class ComGithubBenVersionAccessors extends VersionFactory  {

        private final ComGithubBenManesVersionAccessors vaccForComGithubBenManesVersionAccessors = new ComGithubBenManesVersionAccessors(providers, config);
        public ComGithubBenVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.com.github.ben.manes</b>
         */
        public ComGithubBenManesVersionAccessors getManes() {
            return vaccForComGithubBenManesVersionAccessors;
        }

    }

    public static class ComGithubBenManesVersionAccessors extends VersionFactory  {

        private final ComGithubBenManesCaffeineVersionAccessors vaccForComGithubBenManesCaffeineVersionAccessors = new ComGithubBenManesCaffeineVersionAccessors(providers, config);
        public ComGithubBenManesVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.com.github.ben.manes.caffeine</b>
         */
        public ComGithubBenManesCaffeineVersionAccessors getCaffeine() {
            return vaccForComGithubBenManesCaffeineVersionAccessors;
        }

    }

    public static class ComGithubBenManesCaffeineVersionAccessors extends VersionFactory  {

        public ComGithubBenManesCaffeineVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>com.github.ben.manes.caffeine.caffeine</b> with value <b>3.1.8</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCaffeine() { return getVersion("com.github.ben.manes.caffeine.caffeine"); }

    }

    public static class ComGithubGrowthbookVersionAccessors extends VersionFactory  {

        private final ComGithubGrowthbookGrowthbookVersionAccessors vaccForComGithubGrowthbookGrowthbookVersionAccessors = new ComGithubGrowthbookGrowthbookVersionAccessors(providers, config);
        public ComGithubGrowthbookVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.com.github.growthbook.growthbook</b>
         */
        public ComGithubGrowthbookGrowthbookVersionAccessors getGrowthbook() {
            return vaccForComGithubGrowthbookGrowthbookVersionAccessors;
        }

    }

    public static class ComGithubGrowthbookGrowthbookVersionAccessors extends VersionFactory  {

        private final ComGithubGrowthbookGrowthbookSdkVersionAccessors vaccForComGithubGrowthbookGrowthbookSdkVersionAccessors = new ComGithubGrowthbookGrowthbookSdkVersionAccessors(providers, config);
        public ComGithubGrowthbookGrowthbookVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.com.github.growthbook.growthbook.sdk</b>
         */
        public ComGithubGrowthbookGrowthbookSdkVersionAccessors getSdk() {
            return vaccForComGithubGrowthbookGrowthbookSdkVersionAccessors;
        }

    }

    public static class ComGithubGrowthbookGrowthbookSdkVersionAccessors extends VersionFactory  {

        public ComGithubGrowthbookGrowthbookSdkVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>com.github.growthbook.growthbook.sdk.java</b> with value <b>0.10.5</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJava() { return getVersion("com.github.growthbook.growthbook.sdk.java"); }

    }

    public static class ComGithubIshugaliyVersionAccessors extends VersionFactory  {

        private final ComGithubIshugaliyAllgoodVersionAccessors vaccForComGithubIshugaliyAllgoodVersionAccessors = new ComGithubIshugaliyAllgoodVersionAccessors(providers, config);
        public ComGithubIshugaliyVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.com.github.ishugaliy.allgood</b>
         */
        public ComGithubIshugaliyAllgoodVersionAccessors getAllgood() {
            return vaccForComGithubIshugaliyAllgoodVersionAccessors;
        }

    }

    public static class ComGithubIshugaliyAllgoodVersionAccessors extends VersionFactory  {

        private final ComGithubIshugaliyAllgoodConsistentVersionAccessors vaccForComGithubIshugaliyAllgoodConsistentVersionAccessors = new ComGithubIshugaliyAllgoodConsistentVersionAccessors(providers, config);
        public ComGithubIshugaliyAllgoodVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.com.github.ishugaliy.allgood.consistent</b>
         */
        public ComGithubIshugaliyAllgoodConsistentVersionAccessors getConsistent() {
            return vaccForComGithubIshugaliyAllgoodConsistentVersionAccessors;
        }

    }

    public static class ComGithubIshugaliyAllgoodConsistentVersionAccessors extends VersionFactory  {

        public ComGithubIshugaliyAllgoodConsistentVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>com.github.ishugaliy.allgood.consistent.hash</b> with value <b>1.0.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getHash() { return getVersion("com.github.ishugaliy.allgood.consistent.hash"); }

    }

    public static class ComGithubJsqlparserVersionAccessors extends VersionFactory  {

        public ComGithubJsqlparserVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>com.github.jsqlparser.jsqlparser</b> with value <b>5.3</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJsqlparser() { return getVersion("com.github.jsqlparser.jsqlparser"); }

    }

    public static class ComGithubLoki4jVersionAccessors extends VersionFactory  {

        private final ComGithubLoki4jLokiVersionAccessors vaccForComGithubLoki4jLokiVersionAccessors = new ComGithubLoki4jLokiVersionAccessors(providers, config);
        public ComGithubLoki4jVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.com.github.loki4j.loki</b>
         */
        public ComGithubLoki4jLokiVersionAccessors getLoki() {
            return vaccForComGithubLoki4jLokiVersionAccessors;
        }

    }

    public static class ComGithubLoki4jLokiVersionAccessors extends VersionFactory  {

        private final ComGithubLoki4jLokiLogbackVersionAccessors vaccForComGithubLoki4jLokiLogbackVersionAccessors = new ComGithubLoki4jLokiLogbackVersionAccessors(providers, config);
        public ComGithubLoki4jLokiVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.com.github.loki4j.loki.logback</b>
         */
        public ComGithubLoki4jLokiLogbackVersionAccessors getLogback() {
            return vaccForComGithubLoki4jLokiLogbackVersionAccessors;
        }

    }

    public static class ComGithubLoki4jLokiLogbackVersionAccessors extends VersionFactory  {

        public ComGithubLoki4jLokiLogbackVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>com.github.loki4j.loki.logback.appender</b> with value <b>1.4.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getAppender() { return getVersion("com.github.loki4j.loki.logback.appender"); }

    }

    public static class ComGoogleVersionAccessors extends VersionFactory  {

        private final ComGoogleProtobufVersionAccessors vaccForComGoogleProtobufVersionAccessors = new ComGoogleProtobufVersionAccessors(providers, config);
        public ComGoogleVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.com.google.protobuf</b>
         */
        public ComGoogleProtobufVersionAccessors getProtobuf() {
            return vaccForComGoogleProtobufVersionAccessors;
        }

    }

    public static class ComGoogleProtobufVersionAccessors extends VersionFactory  {

        private final ComGoogleProtobufProtobufVersionAccessors vaccForComGoogleProtobufProtobufVersionAccessors = new ComGoogleProtobufProtobufVersionAccessors(providers, config);
        public ComGoogleProtobufVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.com.google.protobuf.protobuf</b>
         */
        public ComGoogleProtobufProtobufVersionAccessors getProtobuf() {
            return vaccForComGoogleProtobufProtobufVersionAccessors;
        }

    }

    public static class ComGoogleProtobufProtobufVersionAccessors extends VersionFactory  {

        public ComGoogleProtobufProtobufVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>com.google.protobuf.protobuf.java</b> with value <b>3.25.5</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJava() { return getVersion("com.google.protobuf.protobuf.java"); }

    }

    public static class ComZaxxerVersionAccessors extends VersionFactory  {

        public ComZaxxerVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>com.zaxxer.hikaricp</b> with value <b>5.1.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getHikaricp() { return getVersion("com.zaxxer.hikaricp"); }

    }

    public static class CommonsVersionAccessors extends VersionFactory  {

        private final CommonsIoVersionAccessors vaccForCommonsIoVersionAccessors = new CommonsIoVersionAccessors(providers, config);
        public CommonsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.commons.io</b>
         */
        public CommonsIoVersionAccessors getIo() {
            return vaccForCommonsIoVersionAccessors;
        }

    }

    public static class CommonsIoVersionAccessors extends VersionFactory  {

        private final CommonsIoCommonsVersionAccessors vaccForCommonsIoCommonsVersionAccessors = new CommonsIoCommonsVersionAccessors(providers, config);
        public CommonsIoVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.commons.io.commons</b>
         */
        public CommonsIoCommonsVersionAccessors getCommons() {
            return vaccForCommonsIoCommonsVersionAccessors;
        }

    }

    public static class CommonsIoCommonsVersionAccessors extends VersionFactory  {

        public CommonsIoCommonsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>commons.io.commons.io</b> with value <b>2.21.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getIo() { return getVersion("commons.io.commons.io"); }

    }

    public static class CrptVersionAccessors extends VersionFactory  {

        private final CrptBllkVersionAccessors vaccForCrptBllkVersionAccessors = new CrptBllkVersionAccessors(providers, config);
        public CrptVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.crpt.bllk</b>
         */
        public CrptBllkVersionAccessors getBllk() {
            return vaccForCrptBllkVersionAccessors;
        }

    }

    public static class CrptBllkVersionAccessors extends VersionFactory  {

        private final CrptBllkCommonVersionAccessors vaccForCrptBllkCommonVersionAccessors = new CrptBllkCommonVersionAccessors(providers, config);
        public CrptBllkVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.crpt.bllk.common</b>
         */
        public CrptBllkCommonVersionAccessors getCommon() {
            return vaccForCrptBllkCommonVersionAccessors;
        }

    }

    public static class CrptBllkCommonVersionAccessors extends VersionFactory  {

        public CrptBllkCommonVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>crpt.bllk.common.version</b> with value <b>0.0.14-RLS-3699-v42</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("crpt.bllk.common.version"); }

    }

    public static class EmbeddedVersionAccessors extends VersionFactory  {

        private final EmbeddedPostgresVersionAccessors vaccForEmbeddedPostgresVersionAccessors = new EmbeddedPostgresVersionAccessors(providers, config);
        public EmbeddedVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.embedded.postgres</b>
         */
        public EmbeddedPostgresVersionAccessors getPostgres() {
            return vaccForEmbeddedPostgresVersionAccessors;
        }

    }

    public static class EmbeddedPostgresVersionAccessors extends VersionFactory  {

        private final EmbeddedPostgresLibVersionAccessors vaccForEmbeddedPostgresLibVersionAccessors = new EmbeddedPostgresLibVersionAccessors(providers, config);
        public EmbeddedPostgresVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>embedded.postgres.version</b> with value <b>16.8.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("embedded.postgres.version"); }

        /**
         * Group of versions at <b>versions.embedded.postgres.lib</b>
         */
        public EmbeddedPostgresLibVersionAccessors getLib() {
            return vaccForEmbeddedPostgresLibVersionAccessors;
        }

    }

    public static class EmbeddedPostgresLibVersionAccessors extends VersionFactory  {

        public EmbeddedPostgresLibVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>embedded.postgres.lib.version</b> with value <b>2.2.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("embedded.postgres.lib.version"); }

    }

    public static class GuavaVersionAccessors extends VersionFactory  {

        public GuavaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>guava.version</b> with value <b>33.0.0-jre</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("guava.version"); }

    }

    public static class HibernateVersionAccessors extends VersionFactory  {

        private final HibernateJpaVersionAccessors vaccForHibernateJpaVersionAccessors = new HibernateJpaVersionAccessors(providers, config);
        private final HibernateTypesVersionAccessors vaccForHibernateTypesVersionAccessors = new HibernateTypesVersionAccessors(providers, config);
        public HibernateVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.hibernate.jpa</b>
         */
        public HibernateJpaVersionAccessors getJpa() {
            return vaccForHibernateJpaVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.hibernate.types</b>
         */
        public HibernateTypesVersionAccessors getTypes() {
            return vaccForHibernateTypesVersionAccessors;
        }

    }

    public static class HibernateJpaVersionAccessors extends VersionFactory  {

        private final HibernateJpaModelVersionAccessors vaccForHibernateJpaModelVersionAccessors = new HibernateJpaModelVersionAccessors(providers, config);
        public HibernateJpaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.hibernate.jpa.model</b>
         */
        public HibernateJpaModelVersionAccessors getModel() {
            return vaccForHibernateJpaModelVersionAccessors;
        }

    }

    public static class HibernateJpaModelVersionAccessors extends VersionFactory  {

        private final HibernateJpaModelGenVersionAccessors vaccForHibernateJpaModelGenVersionAccessors = new HibernateJpaModelGenVersionAccessors(providers, config);
        public HibernateJpaModelVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.hibernate.jpa.model.gen</b>
         */
        public HibernateJpaModelGenVersionAccessors getGen() {
            return vaccForHibernateJpaModelGenVersionAccessors;
        }

    }

    public static class HibernateJpaModelGenVersionAccessors extends VersionFactory  {

        public HibernateJpaModelGenVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>hibernate.jpa.model.gen.version</b> with value <b>6.2.2.Final</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("hibernate.jpa.model.gen.version"); }

    }

    public static class HibernateTypesVersionAccessors extends VersionFactory  {

        public HibernateTypesVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>hibernate.types.version</b> with value <b>3.8.3</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("hibernate.types.version"); }

    }

    public static class IoVersionAccessors extends VersionFactory  {

        private final IoDebeziumVersionAccessors vaccForIoDebeziumVersionAccessors = new IoDebeziumVersionAccessors(providers, config);
        private final IoGithubVersionAccessors vaccForIoGithubVersionAccessors = new IoGithubVersionAccessors(providers, config);
        private final IoJsonwebtokenVersionAccessors vaccForIoJsonwebtokenVersionAccessors = new IoJsonwebtokenVersionAccessors(providers, config);
        private final IoMicrometerVersionAccessors vaccForIoMicrometerVersionAccessors = new IoMicrometerVersionAccessors(providers, config);
        private final IoNettyVersionAccessors vaccForIoNettyVersionAccessors = new IoNettyVersionAccessors(providers, config);
        private final IoProjectreactorVersionAccessors vaccForIoProjectreactorVersionAccessors = new IoProjectreactorVersionAccessors(providers, config);
        public IoVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.io.debezium</b>
         */
        public IoDebeziumVersionAccessors getDebezium() {
            return vaccForIoDebeziumVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.io.github</b>
         */
        public IoGithubVersionAccessors getGithub() {
            return vaccForIoGithubVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.io.jsonwebtoken</b>
         */
        public IoJsonwebtokenVersionAccessors getJsonwebtoken() {
            return vaccForIoJsonwebtokenVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.io.micrometer</b>
         */
        public IoMicrometerVersionAccessors getMicrometer() {
            return vaccForIoMicrometerVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.io.netty</b>
         */
        public IoNettyVersionAccessors getNetty() {
            return vaccForIoNettyVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.io.projectreactor</b>
         */
        public IoProjectreactorVersionAccessors getProjectreactor() {
            return vaccForIoProjectreactorVersionAccessors;
        }

    }

    public static class IoDebeziumVersionAccessors extends VersionFactory  {

        private final IoDebeziumDebeziumVersionAccessors vaccForIoDebeziumDebeziumVersionAccessors = new IoDebeziumDebeziumVersionAccessors(providers, config);
        public IoDebeziumVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.io.debezium.debezium</b>
         */
        public IoDebeziumDebeziumVersionAccessors getDebezium() {
            return vaccForIoDebeziumDebeziumVersionAccessors;
        }

    }

    public static class IoDebeziumDebeziumVersionAccessors extends VersionFactory  {

        private final IoDebeziumDebeziumConnectorVersionAccessors vaccForIoDebeziumDebeziumConnectorVersionAccessors = new IoDebeziumDebeziumConnectorVersionAccessors(providers, config);
        private final IoDebeziumDebeziumStorageVersionAccessors vaccForIoDebeziumDebeziumStorageVersionAccessors = new IoDebeziumDebeziumStorageVersionAccessors(providers, config);
        public IoDebeziumDebeziumVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>io.debezium.debezium.api</b> with value <b>3.0.7.Final</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getApi() { return getVersion("io.debezium.debezium.api"); }

        /**
         * Version alias <b>io.debezium.debezium.embedded</b> with value <b>3.0.7.Final</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getEmbedded() { return getVersion("io.debezium.debezium.embedded"); }

        /**
         * Group of versions at <b>versions.io.debezium.debezium.connector</b>
         */
        public IoDebeziumDebeziumConnectorVersionAccessors getConnector() {
            return vaccForIoDebeziumDebeziumConnectorVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.io.debezium.debezium.storage</b>
         */
        public IoDebeziumDebeziumStorageVersionAccessors getStorage() {
            return vaccForIoDebeziumDebeziumStorageVersionAccessors;
        }

    }

    public static class IoDebeziumDebeziumConnectorVersionAccessors extends VersionFactory  {

        public IoDebeziumDebeziumConnectorVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>io.debezium.debezium.connector.postgres</b> with value <b>3.0.7.Final</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getPostgres() { return getVersion("io.debezium.debezium.connector.postgres"); }

    }

    public static class IoDebeziumDebeziumStorageVersionAccessors extends VersionFactory  {

        public IoDebeziumDebeziumStorageVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>io.debezium.debezium.storage.jdbc</b> with value <b>3.0.7.Final</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJdbc() { return getVersion("io.debezium.debezium.storage.jdbc"); }

    }

    public static class IoGithubVersionAccessors extends VersionFactory  {

        private final IoGithubMicroutilsVersionAccessors vaccForIoGithubMicroutilsVersionAccessors = new IoGithubMicroutilsVersionAccessors(providers, config);
        private final IoGithubResilience4jVersionAccessors vaccForIoGithubResilience4jVersionAccessors = new IoGithubResilience4jVersionAccessors(providers, config);
        public IoGithubVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.io.github.microutils</b>
         */
        public IoGithubMicroutilsVersionAccessors getMicroutils() {
            return vaccForIoGithubMicroutilsVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.io.github.resilience4j</b>
         */
        public IoGithubResilience4jVersionAccessors getResilience4j() {
            return vaccForIoGithubResilience4jVersionAccessors;
        }

    }

    public static class IoGithubMicroutilsVersionAccessors extends VersionFactory  {

        private final IoGithubMicroutilsKotlinVersionAccessors vaccForIoGithubMicroutilsKotlinVersionAccessors = new IoGithubMicroutilsKotlinVersionAccessors(providers, config);
        public IoGithubMicroutilsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.io.github.microutils.kotlin</b>
         */
        public IoGithubMicroutilsKotlinVersionAccessors getKotlin() {
            return vaccForIoGithubMicroutilsKotlinVersionAccessors;
        }

    }

    public static class IoGithubMicroutilsKotlinVersionAccessors extends VersionFactory  {

        private final IoGithubMicroutilsKotlinLoggingVersionAccessors vaccForIoGithubMicroutilsKotlinLoggingVersionAccessors = new IoGithubMicroutilsKotlinLoggingVersionAccessors(providers, config);
        public IoGithubMicroutilsKotlinVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.io.github.microutils.kotlin.logging</b>
         */
        public IoGithubMicroutilsKotlinLoggingVersionAccessors getLogging() {
            return vaccForIoGithubMicroutilsKotlinLoggingVersionAccessors;
        }

    }

    public static class IoGithubMicroutilsKotlinLoggingVersionAccessors extends VersionFactory  {

        public IoGithubMicroutilsKotlinLoggingVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>io.github.microutils.kotlin.logging.jvm</b> with value <b>3.0.5</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJvm() { return getVersion("io.github.microutils.kotlin.logging.jvm"); }

    }

    public static class IoGithubResilience4jVersionAccessors extends VersionFactory  {

        private final IoGithubResilience4jResilience4jVersionAccessors vaccForIoGithubResilience4jResilience4jVersionAccessors = new IoGithubResilience4jResilience4jVersionAccessors(providers, config);
        public IoGithubResilience4jVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.io.github.resilience4j.resilience4j</b>
         */
        public IoGithubResilience4jResilience4jVersionAccessors getResilience4j() {
            return vaccForIoGithubResilience4jResilience4jVersionAccessors;
        }

    }

    public static class IoGithubResilience4jResilience4jVersionAccessors extends VersionFactory  {

        public IoGithubResilience4jResilience4jVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>io.github.resilience4j.resilience4j.core</b> with value <b>1.7.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCore() { return getVersion("io.github.resilience4j.resilience4j.core"); }

        /**
         * Version alias <b>io.github.resilience4j.resilience4j.kotlin</b> with value <b>1.7.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getKotlin() { return getVersion("io.github.resilience4j.resilience4j.kotlin"); }

        /**
         * Version alias <b>io.github.resilience4j.resilience4j.retry</b> with value <b>1.7.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getRetry() { return getVersion("io.github.resilience4j.resilience4j.retry"); }

    }

    public static class IoJsonwebtokenVersionAccessors extends VersionFactory  {

        private final IoJsonwebtokenJjwtVersionAccessors vaccForIoJsonwebtokenJjwtVersionAccessors = new IoJsonwebtokenJjwtVersionAccessors(providers, config);
        public IoJsonwebtokenVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.io.jsonwebtoken.jjwt</b>
         */
        public IoJsonwebtokenJjwtVersionAccessors getJjwt() {
            return vaccForIoJsonwebtokenJjwtVersionAccessors;
        }

    }

    public static class IoJsonwebtokenJjwtVersionAccessors extends VersionFactory  {

        public IoJsonwebtokenJjwtVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>io.jsonwebtoken.jjwt.version</b> with value <b>0.12.3</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("io.jsonwebtoken.jjwt.version"); }

    }

    public static class IoMicrometerVersionAccessors extends VersionFactory  {

        public IoMicrometerVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>io.micrometer.version</b> with value <b>1.14.3</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("io.micrometer.version"); }

    }

    public static class IoNettyVersionAccessors extends VersionFactory  {

        private final IoNettyNettyVersionAccessors vaccForIoNettyNettyVersionAccessors = new IoNettyNettyVersionAccessors(providers, config);
        public IoNettyVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.io.netty.netty</b>
         */
        public IoNettyNettyVersionAccessors getNetty() {
            return vaccForIoNettyNettyVersionAccessors;
        }

    }

    public static class IoNettyNettyVersionAccessors extends VersionFactory  {

        private final IoNettyNettyCodecVersionAccessors vaccForIoNettyNettyCodecVersionAccessors = new IoNettyNettyCodecVersionAccessors(providers, config);
        public IoNettyNettyVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>io.netty.netty.handler</b> with value <b>4.1.118.Final</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getHandler() { return getVersion("io.netty.netty.handler"); }

        /**
         * Group of versions at <b>versions.io.netty.netty.codec</b>
         */
        public IoNettyNettyCodecVersionAccessors getCodec() {
            return vaccForIoNettyNettyCodecVersionAccessors;
        }

    }

    public static class IoNettyNettyCodecVersionAccessors extends VersionFactory  {

        public IoNettyNettyCodecVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>io.netty.netty.codec.http</b> with value <b>4.1.108.Final</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getHttp() { return getVersion("io.netty.netty.codec.http"); }

    }

    public static class IoProjectreactorVersionAccessors extends VersionFactory  {

        private final IoProjectreactorKotlinVersionAccessors vaccForIoProjectreactorKotlinVersionAccessors = new IoProjectreactorKotlinVersionAccessors(providers, config);
        private final IoProjectreactorReactorVersionAccessors vaccForIoProjectreactorReactorVersionAccessors = new IoProjectreactorReactorVersionAccessors(providers, config);
        public IoProjectreactorVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.io.projectreactor.kotlin</b>
         */
        public IoProjectreactorKotlinVersionAccessors getKotlin() {
            return vaccForIoProjectreactorKotlinVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.io.projectreactor.reactor</b>
         */
        public IoProjectreactorReactorVersionAccessors getReactor() {
            return vaccForIoProjectreactorReactorVersionAccessors;
        }

    }

    public static class IoProjectreactorKotlinVersionAccessors extends VersionFactory  {

        private final IoProjectreactorKotlinReactorVersionAccessors vaccForIoProjectreactorKotlinReactorVersionAccessors = new IoProjectreactorKotlinReactorVersionAccessors(providers, config);
        public IoProjectreactorKotlinVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.io.projectreactor.kotlin.reactor</b>
         */
        public IoProjectreactorKotlinReactorVersionAccessors getReactor() {
            return vaccForIoProjectreactorKotlinReactorVersionAccessors;
        }

    }

    public static class IoProjectreactorKotlinReactorVersionAccessors extends VersionFactory  {

        private final IoProjectreactorKotlinReactorKotlinVersionAccessors vaccForIoProjectreactorKotlinReactorKotlinVersionAccessors = new IoProjectreactorKotlinReactorKotlinVersionAccessors(providers, config);
        public IoProjectreactorKotlinReactorVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.io.projectreactor.kotlin.reactor.kotlin</b>
         */
        public IoProjectreactorKotlinReactorKotlinVersionAccessors getKotlin() {
            return vaccForIoProjectreactorKotlinReactorKotlinVersionAccessors;
        }

    }

    public static class IoProjectreactorKotlinReactorKotlinVersionAccessors extends VersionFactory  {

        public IoProjectreactorKotlinReactorKotlinVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>io.projectreactor.kotlin.reactor.kotlin.extensions</b> with value <b>1.2.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getExtensions() { return getVersion("io.projectreactor.kotlin.reactor.kotlin.extensions"); }

    }

    public static class IoProjectreactorReactorVersionAccessors extends VersionFactory  {

        public IoProjectreactorReactorVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>io.projectreactor.reactor.core</b> with value <b>3.6.3</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCore() { return getVersion("io.projectreactor.reactor.core"); }

        /**
         * Version alias <b>io.projectreactor.reactor.test</b> with value <b>3.5.11</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getTest() { return getVersion("io.projectreactor.reactor.test"); }

    }

    public static class JacksonVersionAccessors extends VersionFactory  {

        public JacksonVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>jackson.version</b> with value <b>2.18.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("jackson.version"); }

    }

    public static class JakartaVersionAccessors extends VersionFactory  {

        private final JakartaAnnotationVersionAccessors vaccForJakartaAnnotationVersionAccessors = new JakartaAnnotationVersionAccessors(providers, config);
        private final JakartaValidationVersionAccessors vaccForJakartaValidationVersionAccessors = new JakartaValidationVersionAccessors(providers, config);
        public JakartaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.jakarta.annotation</b>
         */
        public JakartaAnnotationVersionAccessors getAnnotation() {
            return vaccForJakartaAnnotationVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.jakarta.validation</b>
         */
        public JakartaValidationVersionAccessors getValidation() {
            return vaccForJakartaValidationVersionAccessors;
        }

    }

    public static class JakartaAnnotationVersionAccessors extends VersionFactory  {

        private final JakartaAnnotationJakartaVersionAccessors vaccForJakartaAnnotationJakartaVersionAccessors = new JakartaAnnotationJakartaVersionAccessors(providers, config);
        public JakartaAnnotationVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.jakarta.annotation.jakarta</b>
         */
        public JakartaAnnotationJakartaVersionAccessors getJakarta() {
            return vaccForJakartaAnnotationJakartaVersionAccessors;
        }

    }

    public static class JakartaAnnotationJakartaVersionAccessors extends VersionFactory  {

        private final JakartaAnnotationJakartaAnnotationVersionAccessors vaccForJakartaAnnotationJakartaAnnotationVersionAccessors = new JakartaAnnotationJakartaAnnotationVersionAccessors(providers, config);
        public JakartaAnnotationJakartaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.jakarta.annotation.jakarta.annotation</b>
         */
        public JakartaAnnotationJakartaAnnotationVersionAccessors getAnnotation() {
            return vaccForJakartaAnnotationJakartaAnnotationVersionAccessors;
        }

    }

    public static class JakartaAnnotationJakartaAnnotationVersionAccessors extends VersionFactory  {

        public JakartaAnnotationJakartaAnnotationVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>jakarta.annotation.jakarta.annotation.api</b> with value <b>2.1.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getApi() { return getVersion("jakarta.annotation.jakarta.annotation.api"); }

    }

    public static class JakartaValidationVersionAccessors extends VersionFactory  {

        private final JakartaValidationJakartaVersionAccessors vaccForJakartaValidationJakartaVersionAccessors = new JakartaValidationJakartaVersionAccessors(providers, config);
        public JakartaValidationVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.jakarta.validation.jakarta</b>
         */
        public JakartaValidationJakartaVersionAccessors getJakarta() {
            return vaccForJakartaValidationJakartaVersionAccessors;
        }

    }

    public static class JakartaValidationJakartaVersionAccessors extends VersionFactory  {

        private final JakartaValidationJakartaValidationVersionAccessors vaccForJakartaValidationJakartaValidationVersionAccessors = new JakartaValidationJakartaValidationVersionAccessors(providers, config);
        public JakartaValidationJakartaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.jakarta.validation.jakarta.validation</b>
         */
        public JakartaValidationJakartaValidationVersionAccessors getValidation() {
            return vaccForJakartaValidationJakartaValidationVersionAccessors;
        }

    }

    public static class JakartaValidationJakartaValidationVersionAccessors extends VersionFactory  {

        public JakartaValidationJakartaValidationVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>jakarta.validation.jakarta.validation.api</b> with value <b>3.0.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getApi() { return getVersion("jakarta.validation.jakarta.validation.api"); }

    }

    public static class JaxbVersionAccessors extends VersionFactory  {

        private final JaxbVersionVersionAccessors vaccForJaxbVersionVersionAccessors = new JaxbVersionVersionAccessors(providers, config);
        public JaxbVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.jaxb.version</b>
         */
        public JaxbVersionVersionAccessors getVersion() {
            return vaccForJaxbVersionVersionAccessors;
        }

    }

    public static class JaxbVersionVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        public JaxbVersionVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>jaxb.version</b> with value <b>4.0.5</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("jaxb.version"); }

        /**
         * Version alias <b>jaxb.version.impl</b> with value <b>4.0.9</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getImpl() { return getVersion("jaxb.version.impl"); }

    }

    public static class JunitVersionAccessors extends VersionFactory  {

        public JunitVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>junit.version</b> with value <b>5.11.4</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("junit.version"); }

    }

    public static class KotlinVersionAccessors extends VersionFactory  {

        public KotlinVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>kotlin.version</b> with value <b>2.1.10</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("kotlin.version"); }

    }

    public static class LogbackVersionAccessors extends VersionFactory  {

        public LogbackVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>logback.version</b> with value <b>1.5.16</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("logback.version"); }

    }

    public static class MapstructVersionAccessors extends VersionFactory  {

        public MapstructVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>mapstruct.version</b> with value <b>1.5.3.Final</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("mapstruct.version"); }

    }

    public static class MockitoVersionAccessors extends VersionFactory  {

        public MockitoVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>mockito.version</b> with value <b>5.3.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("mockito.version"); }

    }

    public static class MockkVersionAccessors extends VersionFactory  {

        public MockkVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>mockk.version</b> with value <b>1.14.4</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("mockk.version"); }

    }

    public static class NetVersionAccessors extends VersionFactory  {

        private final NetMinidevVersionAccessors vaccForNetMinidevVersionAccessors = new NetMinidevVersionAccessors(providers, config);
        public NetVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.net.minidev</b>
         */
        public NetMinidevVersionAccessors getMinidev() {
            return vaccForNetMinidevVersionAccessors;
        }

    }

    public static class NetMinidevVersionAccessors extends VersionFactory  {

        private final NetMinidevJsonVersionAccessors vaccForNetMinidevJsonVersionAccessors = new NetMinidevJsonVersionAccessors(providers, config);
        public NetMinidevVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.net.minidev.json</b>
         */
        public NetMinidevJsonVersionAccessors getJson() {
            return vaccForNetMinidevJsonVersionAccessors;
        }

    }

    public static class NetMinidevJsonVersionAccessors extends VersionFactory  {

        public NetMinidevJsonVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>net.minidev.json.smart</b> with value <b>2.5.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getSmart() { return getVersion("net.minidev.json.smart"); }

    }

    public static class OkhttpVersionAccessors extends VersionFactory  {

        public OkhttpVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>okhttp.version</b> with value <b>5.3.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("okhttp.version"); }

    }

    public static class OpentelemetryVersionAccessors extends VersionFactory  {

        private final OpentelemetryInstrumentationVersionAccessors vaccForOpentelemetryInstrumentationVersionAccessors = new OpentelemetryInstrumentationVersionAccessors(providers, config);
        public OpentelemetryVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.opentelemetry.instrumentation</b>
         */
        public OpentelemetryInstrumentationVersionAccessors getInstrumentation() {
            return vaccForOpentelemetryInstrumentationVersionAccessors;
        }

    }

    public static class OpentelemetryInstrumentationVersionAccessors extends VersionFactory  {

        public OpentelemetryInstrumentationVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>opentelemetry.instrumentation.bom</b> with value <b>2.25.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getBom() { return getVersion("opentelemetry.instrumentation.bom"); }

    }

    public static class OrgVersionAccessors extends VersionFactory  {

        private final OrgApacheVersionAccessors vaccForOrgApacheVersionAccessors = new OrgApacheVersionAccessors(providers, config);
        private final OrgAspectjVersionAccessors vaccForOrgAspectjVersionAccessors = new OrgAspectjVersionAccessors(providers, config);
        private final OrgAssertjVersionAccessors vaccForOrgAssertjVersionAccessors = new OrgAssertjVersionAccessors(providers, config);
        private final OrgAsynchttpclientVersionAccessors vaccForOrgAsynchttpclientVersionAccessors = new OrgAsynchttpclientVersionAccessors(providers, config);
        private final OrgAwaitilityVersionAccessors vaccForOrgAwaitilityVersionAccessors = new OrgAwaitilityVersionAccessors(providers, config);
        private final OrgHamcrestVersionAccessors vaccForOrgHamcrestVersionAccessors = new OrgHamcrestVersionAccessors(providers, config);
        private final OrgJetbrainsVersionAccessors vaccForOrgJetbrainsVersionAccessors = new OrgJetbrainsVersionAccessors(providers, config);
        private final OrgJunitVersionAccessors vaccForOrgJunitVersionAccessors = new OrgJunitVersionAccessors(providers, config);
        private final OrgLiquibaseVersionAccessors vaccForOrgLiquibaseVersionAccessors = new OrgLiquibaseVersionAccessors(providers, config);
        private final OrgLz4VersionAccessors vaccForOrgLz4VersionAccessors = new OrgLz4VersionAccessors(providers, config);
        private final OrgMockVersionAccessors vaccForOrgMockVersionAccessors = new OrgMockVersionAccessors(providers, config);
        private final OrgMockitoVersionAccessors vaccForOrgMockitoVersionAccessors = new OrgMockitoVersionAccessors(providers, config);
        private final OrgPostgresqlVersionAccessors vaccForOrgPostgresqlVersionAccessors = new OrgPostgresqlVersionAccessors(providers, config);
        private final OrgSpringdocVersionAccessors vaccForOrgSpringdocVersionAccessors = new OrgSpringdocVersionAccessors(providers, config);
        public OrgVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.testcontainers</b> with value <b>1.21.4</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getTestcontainers() { return getVersion("org.testcontainers"); }

        /**
         * Group of versions at <b>versions.org.apache</b>
         */
        public OrgApacheVersionAccessors getApache() {
            return vaccForOrgApacheVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.aspectj</b>
         */
        public OrgAspectjVersionAccessors getAspectj() {
            return vaccForOrgAspectjVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.assertj</b>
         */
        public OrgAssertjVersionAccessors getAssertj() {
            return vaccForOrgAssertjVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.asynchttpclient</b>
         */
        public OrgAsynchttpclientVersionAccessors getAsynchttpclient() {
            return vaccForOrgAsynchttpclientVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.awaitility</b>
         */
        public OrgAwaitilityVersionAccessors getAwaitility() {
            return vaccForOrgAwaitilityVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.hamcrest</b>
         */
        public OrgHamcrestVersionAccessors getHamcrest() {
            return vaccForOrgHamcrestVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.jetbrains</b>
         */
        public OrgJetbrainsVersionAccessors getJetbrains() {
            return vaccForOrgJetbrainsVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.junit</b>
         */
        public OrgJunitVersionAccessors getJunit() {
            return vaccForOrgJunitVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.liquibase</b>
         */
        public OrgLiquibaseVersionAccessors getLiquibase() {
            return vaccForOrgLiquibaseVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.lz4</b>
         */
        public OrgLz4VersionAccessors getLz4() {
            return vaccForOrgLz4VersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.mock</b>
         */
        public OrgMockVersionAccessors getMock() {
            return vaccForOrgMockVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.mockito</b>
         */
        public OrgMockitoVersionAccessors getMockito() {
            return vaccForOrgMockitoVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.postgresql</b>
         */
        public OrgPostgresqlVersionAccessors getPostgresql() {
            return vaccForOrgPostgresqlVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.springdoc</b>
         */
        public OrgSpringdocVersionAccessors getSpringdoc() {
            return vaccForOrgSpringdocVersionAccessors;
        }

    }

    public static class OrgApacheVersionAccessors extends VersionFactory  {

        private final OrgApacheCommonsVersionAccessors vaccForOrgApacheCommonsVersionAccessors = new OrgApacheCommonsVersionAccessors(providers, config);
        private final OrgApacheHttpcomponentsVersionAccessors vaccForOrgApacheHttpcomponentsVersionAccessors = new OrgApacheHttpcomponentsVersionAccessors(providers, config);
        private final OrgApacheKafkaVersionAccessors vaccForOrgApacheKafkaVersionAccessors = new OrgApacheKafkaVersionAccessors(providers, config);
        private final OrgApachePoiVersionAccessors vaccForOrgApachePoiVersionAccessors = new OrgApachePoiVersionAccessors(providers, config);
        public OrgApacheVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.apache.commons</b>
         */
        public OrgApacheCommonsVersionAccessors getCommons() {
            return vaccForOrgApacheCommonsVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.apache.httpcomponents</b>
         */
        public OrgApacheHttpcomponentsVersionAccessors getHttpcomponents() {
            return vaccForOrgApacheHttpcomponentsVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.apache.kafka</b>
         */
        public OrgApacheKafkaVersionAccessors getKafka() {
            return vaccForOrgApacheKafkaVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.apache.poi</b>
         */
        public OrgApachePoiVersionAccessors getPoi() {
            return vaccForOrgApachePoiVersionAccessors;
        }

    }

    public static class OrgApacheCommonsVersionAccessors extends VersionFactory  {

        private final OrgApacheCommonsCommonsVersionAccessors vaccForOrgApacheCommonsCommonsVersionAccessors = new OrgApacheCommonsCommonsVersionAccessors(providers, config);
        public OrgApacheCommonsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.apache.commons.collections4</b> with value <b>4.4</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCollections4() { return getVersion("org.apache.commons.collections4"); }

        /**
         * Version alias <b>org.apache.commons.lang3</b> with value <b>3.12.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getLang3() { return getVersion("org.apache.commons.lang3"); }

        /**
         * Version alias <b>org.apache.commons.validator</b> with value <b>1.9.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getValidator() { return getVersion("org.apache.commons.validator"); }

        /**
         * Group of versions at <b>versions.org.apache.commons.commons</b>
         */
        public OrgApacheCommonsCommonsVersionAccessors getCommons() {
            return vaccForOrgApacheCommonsCommonsVersionAccessors;
        }

    }

    public static class OrgApacheCommonsCommonsVersionAccessors extends VersionFactory  {

        public OrgApacheCommonsCommonsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.apache.commons.commons.compress</b> with value <b>1.26.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCompress() { return getVersion("org.apache.commons.commons.compress"); }

    }

    public static class OrgApacheHttpcomponentsVersionAccessors extends VersionFactory  {

        private final OrgApacheHttpcomponentsClient5VersionAccessors vaccForOrgApacheHttpcomponentsClient5VersionAccessors = new OrgApacheHttpcomponentsClient5VersionAccessors(providers, config);
        public OrgApacheHttpcomponentsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.apache.httpcomponents.httpclient</b> with value <b>4.5.13</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getHttpclient() { return getVersion("org.apache.httpcomponents.httpclient"); }

        /**
         * Version alias <b>org.apache.httpcomponents.httpcore</b> with value <b>4.4.4</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getHttpcore() { return getVersion("org.apache.httpcomponents.httpcore"); }

        /**
         * Version alias <b>org.apache.httpcomponents.httpmime</b> with value <b>4.5.13</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getHttpmime() { return getVersion("org.apache.httpcomponents.httpmime"); }

        /**
         * Group of versions at <b>versions.org.apache.httpcomponents.client5</b>
         */
        public OrgApacheHttpcomponentsClient5VersionAccessors getClient5() {
            return vaccForOrgApacheHttpcomponentsClient5VersionAccessors;
        }

    }

    public static class OrgApacheHttpcomponentsClient5VersionAccessors extends VersionFactory  {

        private final OrgApacheHttpcomponentsClient5Httpclient5VersionAccessors vaccForOrgApacheHttpcomponentsClient5Httpclient5VersionAccessors = new OrgApacheHttpcomponentsClient5Httpclient5VersionAccessors(providers, config);
        public OrgApacheHttpcomponentsClient5VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.apache.httpcomponents.client5.httpclient5</b>
         */
        public OrgApacheHttpcomponentsClient5Httpclient5VersionAccessors getHttpclient5() {
            return vaccForOrgApacheHttpcomponentsClient5Httpclient5VersionAccessors;
        }

    }

    public static class OrgApacheHttpcomponentsClient5Httpclient5VersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        public OrgApacheHttpcomponentsClient5Httpclient5VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.apache.httpcomponents.client5.httpclient5</b> with value <b>5.4.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("org.apache.httpcomponents.client5.httpclient5"); }

        /**
         * Version alias <b>org.apache.httpcomponents.client5.httpclient5.test</b> with value <b>5.4.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getTest() { return getVersion("org.apache.httpcomponents.client5.httpclient5.test"); }

    }

    public static class OrgApacheKafkaVersionAccessors extends VersionFactory  {

        private final OrgApacheKafkaKafkaVersionAccessors vaccForOrgApacheKafkaKafkaVersionAccessors = new OrgApacheKafkaKafkaVersionAccessors(providers, config);
        public OrgApacheKafkaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.apache.kafka.kafka</b>
         */
        public OrgApacheKafkaKafkaVersionAccessors getKafka() {
            return vaccForOrgApacheKafkaKafkaVersionAccessors;
        }

    }

    public static class OrgApacheKafkaKafkaVersionAccessors extends VersionFactory  {

        public OrgApacheKafkaKafkaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.apache.kafka.kafka.clients</b> with value <b>3.7.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getClients() { return getVersion("org.apache.kafka.kafka.clients"); }

    }

    public static class OrgApachePoiVersionAccessors extends VersionFactory  {

        private final OrgApachePoiPoiVersionAccessors vaccForOrgApachePoiPoiVersionAccessors = new OrgApachePoiPoiVersionAccessors(providers, config);
        public OrgApachePoiVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.apache.poi.poi</b>
         */
        public OrgApachePoiPoiVersionAccessors getPoi() {
            return vaccForOrgApachePoiPoiVersionAccessors;
        }

    }

    public static class OrgApachePoiPoiVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        public OrgApachePoiPoiVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.apache.poi.poi</b> with value <b>5.4.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("org.apache.poi.poi"); }

        /**
         * Version alias <b>org.apache.poi.poi.ooxml</b> with value <b>5.4.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getOoxml() { return getVersion("org.apache.poi.poi.ooxml"); }

    }

    public static class OrgAspectjVersionAccessors extends VersionFactory  {

        public OrgAspectjVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.aspectj.aspectjrt</b> with value <b>1.9.22</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getAspectjrt() { return getVersion("org.aspectj.aspectjrt"); }

        /**
         * Version alias <b>org.aspectj.aspectjweaver</b> with value <b>1.9.22</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getAspectjweaver() { return getVersion("org.aspectj.aspectjweaver"); }

    }

    public static class OrgAssertjVersionAccessors extends VersionFactory  {

        private final OrgAssertjAssertjVersionAccessors vaccForOrgAssertjAssertjVersionAccessors = new OrgAssertjAssertjVersionAccessors(providers, config);
        public OrgAssertjVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.assertj.assertj</b>
         */
        public OrgAssertjAssertjVersionAccessors getAssertj() {
            return vaccForOrgAssertjAssertjVersionAccessors;
        }

    }

    public static class OrgAssertjAssertjVersionAccessors extends VersionFactory  {

        public OrgAssertjAssertjVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.assertj.assertj.core</b> with value <b>3.21.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCore() { return getVersion("org.assertj.assertj.core"); }

    }

    public static class OrgAsynchttpclientVersionAccessors extends VersionFactory  {

        private final OrgAsynchttpclientAsyncVersionAccessors vaccForOrgAsynchttpclientAsyncVersionAccessors = new OrgAsynchttpclientAsyncVersionAccessors(providers, config);
        public OrgAsynchttpclientVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.asynchttpclient.async</b>
         */
        public OrgAsynchttpclientAsyncVersionAccessors getAsync() {
            return vaccForOrgAsynchttpclientAsyncVersionAccessors;
        }

    }

    public static class OrgAsynchttpclientAsyncVersionAccessors extends VersionFactory  {

        private final OrgAsynchttpclientAsyncHttpVersionAccessors vaccForOrgAsynchttpclientAsyncHttpVersionAccessors = new OrgAsynchttpclientAsyncHttpVersionAccessors(providers, config);
        public OrgAsynchttpclientAsyncVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.asynchttpclient.async.http</b>
         */
        public OrgAsynchttpclientAsyncHttpVersionAccessors getHttp() {
            return vaccForOrgAsynchttpclientAsyncHttpVersionAccessors;
        }

    }

    public static class OrgAsynchttpclientAsyncHttpVersionAccessors extends VersionFactory  {

        public OrgAsynchttpclientAsyncHttpVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.asynchttpclient.async.http.client</b> with value <b>3.0.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getClient() { return getVersion("org.asynchttpclient.async.http.client"); }

    }

    public static class OrgAwaitilityVersionAccessors extends VersionFactory  {

        private final OrgAwaitilityAwaitilityVersionAccessors vaccForOrgAwaitilityAwaitilityVersionAccessors = new OrgAwaitilityAwaitilityVersionAccessors(providers, config);
        public OrgAwaitilityVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.awaitility.awaitility</b>
         */
        public OrgAwaitilityAwaitilityVersionAccessors getAwaitility() {
            return vaccForOrgAwaitilityAwaitilityVersionAccessors;
        }

    }

    public static class OrgAwaitilityAwaitilityVersionAccessors extends VersionFactory  {

        public OrgAwaitilityAwaitilityVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.awaitility.awaitility.kotlin</b> with value <b>4.2.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getKotlin() { return getVersion("org.awaitility.awaitility.kotlin"); }

    }

    public static class OrgHamcrestVersionAccessors extends VersionFactory  {

        public OrgHamcrestVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.hamcrest.hamcrest</b> with value <b>2.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getHamcrest() { return getVersion("org.hamcrest.hamcrest"); }

    }

    public static class OrgJetbrainsVersionAccessors extends VersionFactory  {

        private final OrgJetbrainsKotlinxVersionAccessors vaccForOrgJetbrainsKotlinxVersionAccessors = new OrgJetbrainsKotlinxVersionAccessors(providers, config);
        public OrgJetbrainsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.jetbrains.kotlinx</b>
         */
        public OrgJetbrainsKotlinxVersionAccessors getKotlinx() {
            return vaccForOrgJetbrainsKotlinxVersionAccessors;
        }

    }

    public static class OrgJetbrainsKotlinxVersionAccessors extends VersionFactory  {

        private final OrgJetbrainsKotlinxKotlinxVersionAccessors vaccForOrgJetbrainsKotlinxKotlinxVersionAccessors = new OrgJetbrainsKotlinxKotlinxVersionAccessors(providers, config);
        public OrgJetbrainsKotlinxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.jetbrains.kotlinx.coroutines</b> with value <b>1.7.3</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCoroutines() { return getVersion("org.jetbrains.kotlinx.coroutines"); }

        /**
         * Group of versions at <b>versions.org.jetbrains.kotlinx.kotlinx</b>
         */
        public OrgJetbrainsKotlinxKotlinxVersionAccessors getKotlinx() {
            return vaccForOrgJetbrainsKotlinxKotlinxVersionAccessors;
        }

    }

    public static class OrgJetbrainsKotlinxKotlinxVersionAccessors extends VersionFactory  {

        public OrgJetbrainsKotlinxKotlinxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.jetbrains.kotlinx.kotlinx.datetime</b> with value <b>0.7.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getDatetime() { return getVersion("org.jetbrains.kotlinx.kotlinx.datetime"); }

    }

    public static class OrgJunitVersionAccessors extends VersionFactory  {

        private final OrgJunitJupiterVersionAccessors vaccForOrgJunitJupiterVersionAccessors = new OrgJunitJupiterVersionAccessors(providers, config);
        private final OrgJunitPlatformVersionAccessors vaccForOrgJunitPlatformVersionAccessors = new OrgJunitPlatformVersionAccessors(providers, config);
        public OrgJunitVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.junit.jupiter</b>
         */
        public OrgJunitJupiterVersionAccessors getJupiter() {
            return vaccForOrgJunitJupiterVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.junit.platform</b>
         */
        public OrgJunitPlatformVersionAccessors getPlatform() {
            return vaccForOrgJunitPlatformVersionAccessors;
        }

    }

    public static class OrgJunitJupiterVersionAccessors extends VersionFactory  {

        private final OrgJunitJupiterJunitVersionAccessors vaccForOrgJunitJupiterJunitVersionAccessors = new OrgJunitJupiterJunitVersionAccessors(providers, config);
        public OrgJunitJupiterVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.junit.jupiter.junit</b>
         */
        public OrgJunitJupiterJunitVersionAccessors getJunit() {
            return vaccForOrgJunitJupiterJunitVersionAccessors;
        }

    }

    public static class OrgJunitJupiterJunitVersionAccessors extends VersionFactory  {

        private final OrgJunitJupiterJunitJupiterVersionAccessors vaccForOrgJunitJupiterJunitJupiterVersionAccessors = new OrgJunitJupiterJunitJupiterVersionAccessors(providers, config);
        public OrgJunitJupiterJunitVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.junit.jupiter.junit.jupiter</b>
         */
        public OrgJunitJupiterJunitJupiterVersionAccessors getJupiter() {
            return vaccForOrgJunitJupiterJunitJupiterVersionAccessors;
        }

    }

    public static class OrgJunitJupiterJunitJupiterVersionAccessors extends VersionFactory  {

        public OrgJunitJupiterJunitJupiterVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.junit.jupiter.junit.jupiter.engine</b> with value <b>5.11.4</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getEngine() { return getVersion("org.junit.jupiter.junit.jupiter.engine"); }

    }

    public static class OrgJunitPlatformVersionAccessors extends VersionFactory  {

        private final OrgJunitPlatformJunitVersionAccessors vaccForOrgJunitPlatformJunitVersionAccessors = new OrgJunitPlatformJunitVersionAccessors(providers, config);
        public OrgJunitPlatformVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.junit.platform.junit</b>
         */
        public OrgJunitPlatformJunitVersionAccessors getJunit() {
            return vaccForOrgJunitPlatformJunitVersionAccessors;
        }

    }

    public static class OrgJunitPlatformJunitVersionAccessors extends VersionFactory  {

        private final OrgJunitPlatformJunitPlatformVersionAccessors vaccForOrgJunitPlatformJunitPlatformVersionAccessors = new OrgJunitPlatformJunitPlatformVersionAccessors(providers, config);
        public OrgJunitPlatformJunitVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.junit.platform.junit.platform</b>
         */
        public OrgJunitPlatformJunitPlatformVersionAccessors getPlatform() {
            return vaccForOrgJunitPlatformJunitPlatformVersionAccessors;
        }

    }

    public static class OrgJunitPlatformJunitPlatformVersionAccessors extends VersionFactory  {

        public OrgJunitPlatformJunitPlatformVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.junit.platform.junit.platform.launcher</b> with value <b>1.11.4</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getLauncher() { return getVersion("org.junit.platform.junit.platform.launcher"); }

    }

    public static class OrgLiquibaseVersionAccessors extends VersionFactory  {

        private final OrgLiquibaseLiquibaseVersionAccessors vaccForOrgLiquibaseLiquibaseVersionAccessors = new OrgLiquibaseLiquibaseVersionAccessors(providers, config);
        public OrgLiquibaseVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.liquibase.liquibase</b>
         */
        public OrgLiquibaseLiquibaseVersionAccessors getLiquibase() {
            return vaccForOrgLiquibaseLiquibaseVersionAccessors;
        }

    }

    public static class OrgLiquibaseLiquibaseVersionAccessors extends VersionFactory  {

        public OrgLiquibaseLiquibaseVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.liquibase.liquibase.core</b> with value <b>4.25.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCore() { return getVersion("org.liquibase.liquibase.core"); }

    }

    public static class OrgLz4VersionAccessors extends VersionFactory  {

        public OrgLz4VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.lz4.java</b> with value <b>1.8.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJava() { return getVersion("org.lz4.java"); }

    }

    public static class OrgMockVersionAccessors extends VersionFactory  {

        private final OrgMockServerVersionAccessors vaccForOrgMockServerVersionAccessors = new OrgMockServerVersionAccessors(providers, config);
        public OrgMockVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.mock.server</b>
         */
        public OrgMockServerVersionAccessors getServer() {
            return vaccForOrgMockServerVersionAccessors;
        }

    }

    public static class OrgMockServerVersionAccessors extends VersionFactory  {

        private final OrgMockServerMockserverVersionAccessors vaccForOrgMockServerMockserverVersionAccessors = new OrgMockServerMockserverVersionAccessors(providers, config);
        public OrgMockServerVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.mock.server.mockserver</b>
         */
        public OrgMockServerMockserverVersionAccessors getMockserver() {
            return vaccForOrgMockServerMockserverVersionAccessors;
        }

    }

    public static class OrgMockServerMockserverVersionAccessors extends VersionFactory  {

        public OrgMockServerMockserverVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.mock.server.mockserver.netty</b> with value <b>5.15.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getNetty() { return getVersion("org.mock.server.mockserver.netty"); }

    }

    public static class OrgMockitoVersionAccessors extends VersionFactory  {

        private final OrgMockitoKotlinVersionAccessors vaccForOrgMockitoKotlinVersionAccessors = new OrgMockitoKotlinVersionAccessors(providers, config);
        private final OrgMockitoMockitoVersionAccessors vaccForOrgMockitoMockitoVersionAccessors = new OrgMockitoMockitoVersionAccessors(providers, config);
        public OrgMockitoVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.mockito.kotlin</b>
         */
        public OrgMockitoKotlinVersionAccessors getKotlin() {
            return vaccForOrgMockitoKotlinVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.mockito.mockito</b>
         */
        public OrgMockitoMockitoVersionAccessors getMockito() {
            return vaccForOrgMockitoMockitoVersionAccessors;
        }

    }

    public static class OrgMockitoKotlinVersionAccessors extends VersionFactory  {

        private final OrgMockitoKotlinMockitoVersionAccessors vaccForOrgMockitoKotlinMockitoVersionAccessors = new OrgMockitoKotlinMockitoVersionAccessors(providers, config);
        public OrgMockitoKotlinVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.mockito.kotlin.mockito</b>
         */
        public OrgMockitoKotlinMockitoVersionAccessors getMockito() {
            return vaccForOrgMockitoKotlinMockitoVersionAccessors;
        }

    }

    public static class OrgMockitoKotlinMockitoVersionAccessors extends VersionFactory  {

        public OrgMockitoKotlinMockitoVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.mockito.kotlin.mockito.kotlin</b> with value <b>5.0.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getKotlin() { return getVersion("org.mockito.kotlin.mockito.kotlin"); }

    }

    public static class OrgMockitoMockitoVersionAccessors extends VersionFactory  {

        public OrgMockitoMockitoVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.mockito.mockito.inline</b> with value <b>4.8.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getInline() { return getVersion("org.mockito.mockito.inline"); }

    }

    public static class OrgPostgresqlVersionAccessors extends VersionFactory  {

        public OrgPostgresqlVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.postgresql.postgresql</b> with value <b>42.6.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getPostgresql() { return getVersion("org.postgresql.postgresql"); }

    }

    public static class OrgSpringdocVersionAccessors extends VersionFactory  {

        private final OrgSpringdocSpringdocVersionAccessors vaccForOrgSpringdocSpringdocVersionAccessors = new OrgSpringdocSpringdocVersionAccessors(providers, config);
        public OrgSpringdocVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.springdoc.springdoc</b>
         */
        public OrgSpringdocSpringdocVersionAccessors getSpringdoc() {
            return vaccForOrgSpringdocSpringdocVersionAccessors;
        }

    }

    public static class OrgSpringdocSpringdocVersionAccessors extends VersionFactory  {

        private final OrgSpringdocSpringdocOpenapiVersionAccessors vaccForOrgSpringdocSpringdocOpenapiVersionAccessors = new OrgSpringdocSpringdocOpenapiVersionAccessors(providers, config);
        public OrgSpringdocSpringdocVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.springdoc.springdoc.openapi</b>
         */
        public OrgSpringdocSpringdocOpenapiVersionAccessors getOpenapi() {
            return vaccForOrgSpringdocSpringdocOpenapiVersionAccessors;
        }

    }

    public static class OrgSpringdocSpringdocOpenapiVersionAccessors extends VersionFactory  {

        private final OrgSpringdocSpringdocOpenapiStarterVersionAccessors vaccForOrgSpringdocSpringdocOpenapiStarterVersionAccessors = new OrgSpringdocSpringdocOpenapiStarterVersionAccessors(providers, config);
        public OrgSpringdocSpringdocOpenapiVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.springdoc.springdoc.openapi.starter</b>
         */
        public OrgSpringdocSpringdocOpenapiStarterVersionAccessors getStarter() {
            return vaccForOrgSpringdocSpringdocOpenapiStarterVersionAccessors;
        }

    }

    public static class OrgSpringdocSpringdocOpenapiStarterVersionAccessors extends VersionFactory  {

        public OrgSpringdocSpringdocOpenapiStarterVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.springdoc.springdoc.openapi.starter.ui</b> with value <b>2.8.4</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getUi() { return getVersion("org.springdoc.springdoc.openapi.starter.ui"); }

    }

    public static class PreliquibaseVersionAccessors extends VersionFactory  {

        public PreliquibaseVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>preliquibase.version</b> with value <b>1.6.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("preliquibase.version"); }

    }

    public static class ShedlockVersionAccessors extends VersionFactory  {

        public ShedlockVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>shedlock.version</b> with value <b>5.2.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("shedlock.version"); }

    }

    public static class SpringVersionAccessors extends VersionFactory  {

        private final SpringBootVersionAccessors vaccForSpringBootVersionAccessors = new SpringBootVersionAccessors(providers, config);
        private final SpringCloudVersionAccessors vaccForSpringCloudVersionAccessors = new SpringCloudVersionAccessors(providers, config);
        private final SpringDocVersionAccessors vaccForSpringDocVersionAccessors = new SpringDocVersionAccessors(providers, config);
        private final SpringFrameworkVersionAccessors vaccForSpringFrameworkVersionAccessors = new SpringFrameworkVersionAccessors(providers, config);
        private final SpringRetryVersionAccessors vaccForSpringRetryVersionAccessors = new SpringRetryVersionAccessors(providers, config);
        public SpringVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.spring.boot</b>
         */
        public SpringBootVersionAccessors getBoot() {
            return vaccForSpringBootVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.spring.cloud</b>
         */
        public SpringCloudVersionAccessors getCloud() {
            return vaccForSpringCloudVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.spring.doc</b>
         */
        public SpringDocVersionAccessors getDoc() {
            return vaccForSpringDocVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.spring.framework</b>
         */
        public SpringFrameworkVersionAccessors getFramework() {
            return vaccForSpringFrameworkVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.spring.retry</b>
         */
        public SpringRetryVersionAccessors getRetry() {
            return vaccForSpringRetryVersionAccessors;
        }

    }

    public static class SpringBootVersionAccessors extends VersionFactory  {

        public SpringBootVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>spring.boot.version</b> with value <b>3.4.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("spring.boot.version"); }

    }

    public static class SpringCloudVersionAccessors extends VersionFactory  {

        private final SpringCloudDependenciesVersionAccessors vaccForSpringCloudDependenciesVersionAccessors = new SpringCloudDependenciesVersionAccessors(providers, config);
        public SpringCloudVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>spring.cloud.version</b> with value <b>4.2.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("spring.cloud.version"); }

        /**
         * Group of versions at <b>versions.spring.cloud.dependencies</b>
         */
        public SpringCloudDependenciesVersionAccessors getDependencies() {
            return vaccForSpringCloudDependenciesVersionAccessors;
        }

    }

    public static class SpringCloudDependenciesVersionAccessors extends VersionFactory  {

        public SpringCloudDependenciesVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>spring.cloud.dependencies.version</b> with value <b>2024.0.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("spring.cloud.dependencies.version"); }

    }

    public static class SpringDocVersionAccessors extends VersionFactory  {

        private final SpringDocOpenapiVersionAccessors vaccForSpringDocOpenapiVersionAccessors = new SpringDocOpenapiVersionAccessors(providers, config);
        public SpringDocVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.spring.doc.openapi</b>
         */
        public SpringDocOpenapiVersionAccessors getOpenapi() {
            return vaccForSpringDocOpenapiVersionAccessors;
        }

    }

    public static class SpringDocOpenapiVersionAccessors extends VersionFactory  {

        public SpringDocOpenapiVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>spring.doc.openapi.version</b> with value <b>2.8.4</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("spring.doc.openapi.version"); }

    }

    public static class SpringFrameworkVersionAccessors extends VersionFactory  {

        public SpringFrameworkVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>spring.framework.version</b> with value <b>6.2.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("spring.framework.version"); }

    }

    public static class SpringRetryVersionAccessors extends VersionFactory  {

        public SpringRetryVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>spring.retry.version</b> with value <b>2.0.12</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("spring.retry.version"); }

    }

    public static class TemporalVersionAccessors extends VersionFactory  {

        private final TemporalSpringVersionAccessors vaccForTemporalSpringVersionAccessors = new TemporalSpringVersionAccessors(providers, config);
        public TemporalVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>temporal.version</b> with value <b>1.27.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("temporal.version"); }

        /**
         * Group of versions at <b>versions.temporal.spring</b>
         */
        public TemporalSpringVersionAccessors getSpring() {
            return vaccForTemporalSpringVersionAccessors;
        }

    }

    public static class TemporalSpringVersionAccessors extends VersionFactory  {

        private final TemporalSpringBootVersionAccessors vaccForTemporalSpringBootVersionAccessors = new TemporalSpringBootVersionAccessors(providers, config);
        public TemporalSpringVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.temporal.spring.boot</b>
         */
        public TemporalSpringBootVersionAccessors getBoot() {
            return vaccForTemporalSpringBootVersionAccessors;
        }

    }

    public static class TemporalSpringBootVersionAccessors extends VersionFactory  {

        public TemporalSpringBootVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>temporal.spring.boot.version</b> with value <b>1.27.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("temporal.spring.boot.version"); }

    }

    public static class BundleAccessors extends BundleFactory {
        private final BllkBundleAccessors baccForBllkBundleAccessors = new BllkBundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
        private final Okhttp3BundleAccessors baccForOkhttp3BundleAccessors = new Okhttp3BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
        private final SpringBundleAccessors baccForSpringBundleAccessors = new SpringBundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
        private final ThirdBundleAccessors baccForThirdBundleAccessors = new ThirdBundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, AttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

        /**
         * Dependency bundle provider for <b>jackson</b> which contains the following dependencies:
         * <ul>
         *    <li>com.fasterxml.jackson.module:jackson-module-kotlin</li>
         *    <li>com.fasterxml.jackson.datatype:jackson-datatype-jsr310</li>
         *    <li>com.fasterxml.jackson.dataformat:jackson-dataformat-csv</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog libs.versions.toml
         */
        public Provider<ExternalModuleDependencyBundle> getJackson() {
            return createBundle("jackson");
        }

        /**
         * Dependency bundle provider for <b>logback</b> which contains the following dependencies:
         * <ul>
         *    <li>ch.qos.logback:logback-classic</li>
         *    <li>ch.qos.logback:logback-core</li>
         *    <li>net.logstash.logback:logstash-logback-encoder</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog libs.versions.toml
         */
        public Provider<ExternalModuleDependencyBundle> getLogback() {
            return createBundle("logback");
        }

        /**
         * Dependency bundle provider for <b>minio</b> which contains the following dependencies:
         * <ul>
         *    <li>io.minio:minio</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog libs.versions.toml
         */
        public Provider<ExternalModuleDependencyBundle> getMinio() {
            return createBundle("minio");
        }

        /**
         * Dependency bundle provider for <b>mockito</b> which contains the following dependencies:
         * <ul>
         *    <li>org.mockito.kotlin:mockito-kotlin</li>
         *    <li>org.mockito:mockito-junit-jupiter</li>
         *    <li>org.mockito:mockito-core</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog libs.versions.toml
         */
        public Provider<ExternalModuleDependencyBundle> getMockito() {
            return createBundle("mockito");
        }

        /**
         * Dependency bundle provider for <b>opentelemetry</b> which contains the following dependencies:
         * <ul>
         *    <li>io.opentelemetry:opentelemetry-sdk</li>
         *    <li>io.opentelemetry:opentelemetry-common</li>
         *    <li>io.opentelemetry:opentelemetry-sdk-common</li>
         *    <li>io.opentelemetry:opentelemetry-exporter-otlp</li>
         *    <li>io.opentelemetry:opentelemetry-exporter-otlp-common</li>
         *    <li>io.opentelemetry:opentelemetry-exporter-sender-okhttp</li>
         *    <li>io.opentelemetry:opentelemetry-exporter-common</li>
         *    <li>io.opentelemetry:opentelemetry-opentracing-shim</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog libs.versions.toml
         */
        public Provider<ExternalModuleDependencyBundle> getOpentelemetry() {
            return createBundle("opentelemetry");
        }

        /**
         * Dependency bundle provider for <b>s3aws</b> which contains the following dependencies:
         * <ul>
         *    <li>software.amazon.awssdk:s3</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog libs.versions.toml
         */
        public Provider<ExternalModuleDependencyBundle> getS3aws() {
            return createBundle("s3aws");
        }

        /**
         * Dependency bundle provider for <b>temporal</b> which contains the following dependencies:
         * <ul>
         *    <li>io.temporal:temporal-sdk</li>
         *    <li>com.google.guava:guava</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog libs.versions.toml
         */
        public Provider<ExternalModuleDependencyBundle> getTemporal() {
            return createBundle("temporal");
        }

        /**
         * Dependency bundle provider for <b>testcontainers</b> which contains the following dependencies:
         * <ul>
         *    <li>org.testcontainers:testcontainers</li>
         *    <li>org.testcontainers:postgresql</li>
         *    <li>org.testcontainers:kafka</li>
         *    <li>org.testcontainers:junit-jupiter</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog libs.versions.toml
         */
        public Provider<ExternalModuleDependencyBundle> getTestcontainers() {
            return createBundle("testcontainers");
        }

        /**
         * Group of bundles at <b>bundles.bllk</b>
         */
        public BllkBundleAccessors getBllk() {
            return baccForBllkBundleAccessors;
        }

        /**
         * Group of bundles at <b>bundles.okhttp3</b>
         */
        public Okhttp3BundleAccessors getOkhttp3() {
            return baccForOkhttp3BundleAccessors;
        }

        /**
         * Group of bundles at <b>bundles.spring</b>
         */
        public SpringBundleAccessors getSpring() {
            return baccForSpringBundleAccessors;
        }

        /**
         * Group of bundles at <b>bundles.third</b>
         */
        public ThirdBundleAccessors getThird() {
            return baccForThirdBundleAccessors;
        }

    }

    public static class BllkBundleAccessors extends BundleFactory {

        public BllkBundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, AttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

        /**
         * Dependency bundle provider for <b>bllk.common</b> which contains the following dependencies:
         * <ul>
         *    <li>ru.crpt.bllk:bllk-unified-logging-webmvc-autoconfigure</li>
         *    <li>ru.crpt.bllk:bllk-monitoring-webmvc-autoconfigure</li>
         *    <li>ru.crpt.bllk:bllk-swagger-autoconfigure</li>
         *    <li>ru.crpt.bllk:bllk-header-forward-webmvc-autoconfigure</li>
         *    <li>ru.crpt.bllk:bllk-feign-webmvc-autoconfigure</li>
         *    <li>ru.crpt.bllk:bllk-unified-logging-feign-autoconfigure</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog libs.versions.toml
         */
        public Provider<ExternalModuleDependencyBundle> getCommon() {
            return createBundle("bllk.common");
        }

    }

    public static class Okhttp3BundleAccessors extends BundleFactory {

        public Okhttp3BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, AttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

        /**
         * Dependency bundle provider for <b>okhttp3.mockwebserver</b> which contains the following dependencies:
         * <ul>
         *    <li>com.squareup.okhttp3:mockwebserver</li>
         *    <li>com.squareup.okhttp3:okhttp</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog libs.versions.toml
         */
        public Provider<ExternalModuleDependencyBundle> getMockwebserver() {
            return createBundle("okhttp3.mockwebserver");
        }

    }

    public static class SpringBundleAccessors extends BundleFactory  implements BundleNotationSupplier{
        private final SpringOpenapiBundleAccessors baccForSpringOpenapiBundleAccessors = new SpringOpenapiBundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);

        public SpringBundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, AttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

        /**
         * Dependency bundle provider for <b>spring</b> which contains the following dependencies:
         * <ul>
         *    <li>org.springframework.boot:spring-boot-starter-web</li>
         *    <li>org.springframework.boot:spring-boot-starter-actuator</li>
         *    <li>org.springframework.boot:spring-boot-starter-validation</li>
         *    <li>org.springframework.boot:spring-boot-starter-jdbc</li>
         *    <li>org.springframework.boot:spring-boot-starter-aop</li>
         *    <li>org.springframework.cloud:spring-cloud-starter-openfeign</li>
         *    <li>io.github.openfeign:feign-okhttp</li>
         *    <li>org.springframework.boot:spring-boot-starter-data-jpa</li>
         *    <li>org.springframework.kafka:spring-kafka</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog libs.versions.toml
         */
        public Provider<ExternalModuleDependencyBundle> asProvider() {
            return createBundle("spring");
        }

        /**
         * Group of bundles at <b>bundles.spring.openapi</b>
         */
        public SpringOpenapiBundleAccessors getOpenapi() {
            return baccForSpringOpenapiBundleAccessors;
        }

    }

    public static class SpringOpenapiBundleAccessors extends BundleFactory {

        public SpringOpenapiBundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, AttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

        /**
         * Dependency bundle provider for <b>spring.openapi.app</b> which contains the following dependencies:
         * <ul>
         *    <li>org.springdoc:springdoc-openapi-starter-webmvc-ui</li>
         *    <li>org.springdoc:springdoc-openapi-starter-common</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog libs.versions.toml
         */
        public Provider<ExternalModuleDependencyBundle> getApp() {
            return createBundle("spring.openapi.app");
        }

    }

    public static class ThirdBundleAccessors extends BundleFactory {

        public ThirdBundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, AttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

        /**
         * Dependency bundle provider for <b>third.party</b> which contains the following dependencies:
         * <ul>
         *    <li>commons-io:commons-io</li>
         *    <li>org.apache.commons:commons-compress</li>
         *    <li>commons-codec:commons-codec</li>
         *    <li>commons-configuration:commons-configuration</li>
         *    <li>com.google.guava:guava</li>
         *    <li>com.jayway.jsonpath:json-path</li>
         *    <li>org.xmlunit:xmlunit-core</li>
         *    <li>com.nimbusds:nimbus-jose-jwt</li>
         *    <li>org.bouncycastle:bcprov-jdk18on</li>
         *    <li>org.apache.kafka:kafka-clients</li>
         *    <li>com.google.protobuf:protobuf-java</li>
         *    <li>org.apache.tomcat.embed:tomcat-embed-core</li>
         *    <li>org.codehaus.janino:janino</li>
         *    <li>net.minidev:json-smart</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog libs.versions.toml
         */
        public Provider<ExternalModuleDependencyBundle> getParty() {
            return createBundle("third.party");
        }

    }

    public static class PluginAccessors extends PluginFactory {
        private final IoPluginAccessors paccForIoPluginAccessors = new IoPluginAccessors(providers, config);
        private final OrgPluginAccessors paccForOrgPluginAccessors = new OrgPluginAccessors(providers, config);

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of plugins at <b>plugins.io</b>
         */
        public IoPluginAccessors getIo() {
            return paccForIoPluginAccessors;
        }

        /**
         * Group of plugins at <b>plugins.org</b>
         */
        public OrgPluginAccessors getOrg() {
            return paccForOrgPluginAccessors;
        }

    }

    public static class IoPluginAccessors extends PluginFactory {
        private final IoQametaPluginAccessors paccForIoQametaPluginAccessors = new IoQametaPluginAccessors(providers, config);

        public IoPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of plugins at <b>plugins.io.qameta</b>
         */
        public IoQametaPluginAccessors getQameta() {
            return paccForIoQametaPluginAccessors;
        }

    }

    public static class IoQametaPluginAccessors extends PluginFactory {

        public IoQametaPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Plugin provider for <b>io.qameta.allure</b> with plugin id <b>io.qameta.allure</b> and
         * with version reference <b>allure.plugin.version</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getAllure() { return createPlugin("io.qameta.allure"); }

    }

    public static class OrgPluginAccessors extends PluginFactory {
        private final OrgSpringframeworkPluginAccessors paccForOrgSpringframeworkPluginAccessors = new OrgSpringframeworkPluginAccessors(providers, config);

        public OrgPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of plugins at <b>plugins.org.springframework</b>
         */
        public OrgSpringframeworkPluginAccessors getSpringframework() {
            return paccForOrgSpringframeworkPluginAccessors;
        }

    }

    public static class OrgSpringframeworkPluginAccessors extends PluginFactory {

        public OrgSpringframeworkPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Plugin provider for <b>org.springframework.boot</b> with plugin id <b>org.springframework.boot</b> and
         * with version reference <b>spring.boot.version</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getBoot() { return createPlugin("org.springframework.boot"); }

    }

}
