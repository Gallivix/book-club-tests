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
public class LibrariesForLibsInPluginsBlock extends AbstractExternalDependencyFactory {

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
    public LibrariesForLibsInPluginsBlock(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, AttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

    /**
     * Dependency provider for <b>preliquibase</b> with <b>net.lbruun.springboot:preliquibase-spring-boot-starter</b> coordinates and
     * with version reference <b>preliquibase.version</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public Provider<MinimalExternalModuleDependency> getPreliquibase() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return create("preliquibase");
    }

    /**
     * Group of libraries at <b>bouncycastle</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public BouncycastleLibraryAccessors getBouncycastle() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForBouncycastleLibraryAccessors;
    }

    /**
     * Group of libraries at <b>com</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public ComLibraryAccessors getCom() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForComLibraryAccessors;
    }

    /**
     * Group of libraries at <b>commons</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public CommonsLibraryAccessors getCommons() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForCommonsLibraryAccessors;
    }

    /**
     * Group of libraries at <b>crpt</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public CrptLibraryAccessors getCrpt() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForCrptLibraryAccessors;
    }

    /**
     * Group of libraries at <b>hibernate</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public HibernateLibraryAccessors getHibernate() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForHibernateLibraryAccessors;
    }

    /**
     * Group of libraries at <b>io</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public IoLibraryAccessors getIo() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForIoLibraryAccessors;
    }

    /**
     * Group of libraries at <b>jackson</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public JacksonLibraryAccessors getJackson() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForJacksonLibraryAccessors;
    }

    /**
     * Group of libraries at <b>jakarta</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public JakartaLibraryAccessors getJakarta() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForJakartaLibraryAccessors;
    }

    /**
     * Group of libraries at <b>janino</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public JaninoLibraryAccessors getJanino() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForJaninoLibraryAccessors;
    }

    /**
     * Group of libraries at <b>kotlin</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public KotlinLibraryAccessors getKotlin() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForKotlinLibraryAccessors;
    }

    /**
     * Group of libraries at <b>logback</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public LogbackLibraryAccessors getLogback() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForLogbackLibraryAccessors;
    }

    /**
     * Group of libraries at <b>logstash</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public LogstashLibraryAccessors getLogstash() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForLogstashLibraryAccessors;
    }

    /**
     * Group of libraries at <b>mapstruct</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public MapstructLibraryAccessors getMapstruct() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForMapstructLibraryAccessors;
    }

    /**
     * Group of libraries at <b>minidev</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public MinidevLibraryAccessors getMinidev() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForMinidevLibraryAccessors;
    }

    /**
     * Group of libraries at <b>minio</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public MinioLibraryAccessors getMinio() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForMinioLibraryAccessors;
    }

    /**
     * Group of libraries at <b>nimbus</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public NimbusLibraryAccessors getNimbus() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForNimbusLibraryAccessors;
    }

    /**
     * Group of libraries at <b>org</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public OrgLibraryAccessors getOrg() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForOrgLibraryAccessors;
    }

    /**
     * Group of libraries at <b>s3</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public S3LibraryAccessors getS3() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForS3LibraryAccessors;
    }

    /**
     * Group of libraries at <b>shedlock</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public ShedlockLibraryAccessors getShedlock() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForShedlockLibraryAccessors;
    }

    /**
     * Group of libraries at <b>software</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public SoftwareLibraryAccessors getSoftware() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForSoftwareLibraryAccessors;
    }

    /**
     * Group of libraries at <b>spring</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public SpringLibraryAccessors getSpring() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForSpringLibraryAccessors;
    }

    /**
     * Group of libraries at <b>testcontainers</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public TestcontainersLibraryAccessors getTestcontainers() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForTestcontainersLibraryAccessors;
    }

    /**
     * Group of libraries at <b>tomcat</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public TomcatLibraryAccessors getTomcat() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForTomcatLibraryAccessors;
    }

    /**
     * Group of libraries at <b>xmlunit</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public XmlunitLibraryAccessors getXmlunit() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
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
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public BundleAccessors getBundles() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return baccForBundleAccessors;
    }

    /**
     * Group of plugins at <b>plugins</b>
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class BouncycastleLibraryAccessors extends SubDependencyFactory {

        public BouncycastleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>bcprov</b> with <b>org.bouncycastle:bcprov-jdk18on</b> coordinates and
         * with version <b>1.78</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getBcprov() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("bouncycastle.bcprov");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
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
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComClickhouseLibraryAccessors getClickhouse() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComClickhouseLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.fasterxml</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComFasterxmlLibraryAccessors getFasterxml() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComFasterxmlLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.github</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComGithubLibraryAccessors getGithub() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComGithubLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.google</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComGoogleLibraryAccessors getGoogle() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComGoogleLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.jayway</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComJaywayLibraryAccessors getJayway() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComJaywayLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.squareup</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComSquareupLibraryAccessors getSquareup() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComSquareupLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.sun</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComSunLibraryAccessors getSun() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComSunLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.zaxxer</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComZaxxerLibraryAccessors getZaxxer() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComZaxxerLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComClickhouseLibraryAccessors extends SubDependencyFactory {
        private final ComClickhouseClickhouseLibraryAccessors laccForComClickhouseClickhouseLibraryAccessors = new ComClickhouseClickhouseLibraryAccessors(owner);
        private final ComClickhouseClientLibraryAccessors laccForComClickhouseClientLibraryAccessors = new ComClickhouseClientLibraryAccessors(owner);

        public ComClickhouseLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.clickhouse.clickhouse</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComClickhouseClickhouseLibraryAccessors getClickhouse() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComClickhouseClickhouseLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.clickhouse.client</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComClickhouseClientLibraryAccessors getClient() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComClickhouseClientLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComClickhouseClickhouseLibraryAccessors extends SubDependencyFactory {
        private final ComClickhouseClickhouseHttpLibraryAccessors laccForComClickhouseClickhouseHttpLibraryAccessors = new ComClickhouseClickhouseHttpLibraryAccessors(owner);

        public ComClickhouseClickhouseLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>client</b> with <b>com.clickhouse:clickhouse-client</b> coordinates and
         * with version reference <b>com.clickhouse.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getClient() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.clickhouse.clickhouse.client");
        }

        /**
         * Dependency provider for <b>data</b> with <b>com.clickhouse:clickhouse-data</b> coordinates and
         * with version reference <b>com.clickhouse.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getData() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.clickhouse.clickhouse.data");
        }

        /**
         * Dependency provider for <b>jdbc</b> with <b>com.clickhouse:clickhouse-jdbc</b> coordinates and
         * with version reference <b>com.clickhouse.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJdbc() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.clickhouse.clickhouse.jdbc");
        }

        /**
         * Group of libraries at <b>com.clickhouse.clickhouse.http</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComClickhouseClickhouseHttpLibraryAccessors getHttp() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComClickhouseClickhouseHttpLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComClickhouseClickhouseHttpLibraryAccessors extends SubDependencyFactory {

        public ComClickhouseClickhouseHttpLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>client</b> with <b>com.clickhouse:clickhouse-http-client</b> coordinates and
         * with version reference <b>com.clickhouse.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getClient() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.clickhouse.clickhouse.http.client");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComClickhouseClientLibraryAccessors extends SubDependencyFactory {

        public ComClickhouseClientLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>v2</b> with <b>com.clickhouse:client-v2</b> coordinates and
         * with version reference <b>com.clickhouse.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getV2() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.clickhouse.client.v2");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComFasterxmlLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlJacksonLibraryAccessors laccForComFasterxmlJacksonLibraryAccessors = new ComFasterxmlJacksonLibraryAccessors(owner);
        private final ComFasterxmlUuidLibraryAccessors laccForComFasterxmlUuidLibraryAccessors = new ComFasterxmlUuidLibraryAccessors(owner);

        public ComFasterxmlLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.fasterxml.jackson</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComFasterxmlJacksonLibraryAccessors getJackson() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComFasterxmlJacksonLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.fasterxml.uuid</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComFasterxmlUuidLibraryAccessors getUuid() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComFasterxmlUuidLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComFasterxmlJacksonLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlJacksonCoreLibraryAccessors laccForComFasterxmlJacksonCoreLibraryAccessors = new ComFasterxmlJacksonCoreLibraryAccessors(owner);
        private final ComFasterxmlJacksonDataformatLibraryAccessors laccForComFasterxmlJacksonDataformatLibraryAccessors = new ComFasterxmlJacksonDataformatLibraryAccessors(owner);
        private final ComFasterxmlJacksonDatatypeLibraryAccessors laccForComFasterxmlJacksonDatatypeLibraryAccessors = new ComFasterxmlJacksonDatatypeLibraryAccessors(owner);
        private final ComFasterxmlJacksonModuleLibraryAccessors laccForComFasterxmlJacksonModuleLibraryAccessors = new ComFasterxmlJacksonModuleLibraryAccessors(owner);

        public ComFasterxmlJacksonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.fasterxml.jackson.core</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComFasterxmlJacksonCoreLibraryAccessors getCore() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComFasterxmlJacksonCoreLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.fasterxml.jackson.dataformat</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComFasterxmlJacksonDataformatLibraryAccessors getDataformat() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComFasterxmlJacksonDataformatLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.fasterxml.jackson.datatype</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComFasterxmlJacksonDatatypeLibraryAccessors getDatatype() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComFasterxmlJacksonDatatypeLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.fasterxml.jackson.module</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComFasterxmlJacksonModuleLibraryAccessors getModule() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComFasterxmlJacksonModuleLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComFasterxmlJacksonCoreLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlJacksonCoreJacksonLibraryAccessors laccForComFasterxmlJacksonCoreJacksonLibraryAccessors = new ComFasterxmlJacksonCoreJacksonLibraryAccessors(owner);

        public ComFasterxmlJacksonCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.fasterxml.jackson.core.jackson</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComFasterxmlJacksonCoreJacksonLibraryAccessors getJackson() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComFasterxmlJacksonCoreJacksonLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComFasterxmlJacksonCoreJacksonLibraryAccessors extends SubDependencyFactory {

        public ComFasterxmlJacksonCoreJacksonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>annotations</b> with <b>com.fasterxml.jackson.core:jackson-annotations</b> coordinates and
         * with version reference <b>jackson.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getAnnotations() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.fasterxml.jackson.core.jackson.annotations");
        }

        /**
         * Dependency provider for <b>core</b> with <b>com.fasterxml.jackson.core:jackson-core</b> coordinates and
         * with version reference <b>jackson.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCore() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.fasterxml.jackson.core.jackson.core");
        }

        /**
         * Dependency provider for <b>databind</b> with <b>com.fasterxml.jackson.core:jackson-databind</b> coordinates and
         * with version reference <b>jackson.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getDatabind() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.fasterxml.jackson.core.jackson.databind");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComFasterxmlJacksonDataformatLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlJacksonDataformatJacksonLibraryAccessors laccForComFasterxmlJacksonDataformatJacksonLibraryAccessors = new ComFasterxmlJacksonDataformatJacksonLibraryAccessors(owner);

        public ComFasterxmlJacksonDataformatLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.fasterxml.jackson.dataformat.jackson</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComFasterxmlJacksonDataformatJacksonLibraryAccessors getJackson() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComFasterxmlJacksonDataformatJacksonLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComFasterxmlJacksonDataformatJacksonLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlJacksonDataformatJacksonDataformatLibraryAccessors laccForComFasterxmlJacksonDataformatJacksonDataformatLibraryAccessors = new ComFasterxmlJacksonDataformatJacksonDataformatLibraryAccessors(owner);

        public ComFasterxmlJacksonDataformatJacksonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.fasterxml.jackson.dataformat.jackson.dataformat</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComFasterxmlJacksonDataformatJacksonDataformatLibraryAccessors getDataformat() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComFasterxmlJacksonDataformatJacksonDataformatLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComFasterxmlJacksonDataformatJacksonDataformatLibraryAccessors extends SubDependencyFactory {

        public ComFasterxmlJacksonDataformatJacksonDataformatLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>csv</b> with <b>com.fasterxml.jackson.dataformat:jackson-dataformat-csv</b> coordinates and
         * with version reference <b>jackson.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCsv() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.fasterxml.jackson.dataformat.jackson.dataformat.csv");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComFasterxmlJacksonDatatypeLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlJacksonDatatypeJacksonLibraryAccessors laccForComFasterxmlJacksonDatatypeJacksonLibraryAccessors = new ComFasterxmlJacksonDatatypeJacksonLibraryAccessors(owner);

        public ComFasterxmlJacksonDatatypeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.fasterxml.jackson.datatype.jackson</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComFasterxmlJacksonDatatypeJacksonLibraryAccessors getJackson() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComFasterxmlJacksonDatatypeJacksonLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComFasterxmlJacksonDatatypeJacksonLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlJacksonDatatypeJacksonDatatypeLibraryAccessors laccForComFasterxmlJacksonDatatypeJacksonDatatypeLibraryAccessors = new ComFasterxmlJacksonDatatypeJacksonDatatypeLibraryAccessors(owner);

        public ComFasterxmlJacksonDatatypeJacksonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.fasterxml.jackson.datatype.jackson.datatype</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComFasterxmlJacksonDatatypeJacksonDatatypeLibraryAccessors getDatatype() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComFasterxmlJacksonDatatypeJacksonDatatypeLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComFasterxmlJacksonDatatypeJacksonDatatypeLibraryAccessors extends SubDependencyFactory {

        public ComFasterxmlJacksonDatatypeJacksonDatatypeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jdk8</b> with <b>com.fasterxml.jackson.datatype:jackson-datatype-jdk8</b> coordinates and
         * with version reference <b>jackson.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJdk8() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.fasterxml.jackson.datatype.jackson.datatype.jdk8");
        }

        /**
         * Dependency provider for <b>jsr310</b> with <b>com.fasterxml.jackson.datatype:jackson-datatype-jsr310</b> coordinates and
         * with version reference <b>jackson.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJsr310() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.fasterxml.jackson.datatype.jackson.datatype.jsr310");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComFasterxmlJacksonModuleLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlJacksonModuleJacksonLibraryAccessors laccForComFasterxmlJacksonModuleJacksonLibraryAccessors = new ComFasterxmlJacksonModuleJacksonLibraryAccessors(owner);

        public ComFasterxmlJacksonModuleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.fasterxml.jackson.module.jackson</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComFasterxmlJacksonModuleJacksonLibraryAccessors getJackson() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComFasterxmlJacksonModuleJacksonLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComFasterxmlJacksonModuleJacksonLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlJacksonModuleJacksonModuleLibraryAccessors laccForComFasterxmlJacksonModuleJacksonModuleLibraryAccessors = new ComFasterxmlJacksonModuleJacksonModuleLibraryAccessors(owner);

        public ComFasterxmlJacksonModuleJacksonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.fasterxml.jackson.module.jackson.module</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComFasterxmlJacksonModuleJacksonModuleLibraryAccessors getModule() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComFasterxmlJacksonModuleJacksonModuleLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComFasterxmlJacksonModuleJacksonModuleLibraryAccessors extends SubDependencyFactory {

        public ComFasterxmlJacksonModuleJacksonModuleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>afterburner</b> with <b>com.fasterxml.jackson.module:jackson-module-afterburner</b> coordinates and
         * with version reference <b>jackson.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getAfterburner() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.fasterxml.jackson.module.jackson.module.afterburner");
        }

        /**
         * Dependency provider for <b>blackbird</b> with <b>com.fasterxml.jackson.module:jackson-module-blackbird</b> coordinates and
         * with version reference <b>jackson.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getBlackbird() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.fasterxml.jackson.module.jackson.module.blackbird");
        }

        /**
         * Dependency provider for <b>kotlin</b> with <b>com.fasterxml.jackson.module:jackson-module-kotlin</b> coordinates and
         * with version reference <b>jackson.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getKotlin() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.fasterxml.jackson.module.jackson.module.kotlin");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComFasterxmlUuidLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlUuidJavaLibraryAccessors laccForComFasterxmlUuidJavaLibraryAccessors = new ComFasterxmlUuidJavaLibraryAccessors(owner);

        public ComFasterxmlUuidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.fasterxml.uuid.java</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComFasterxmlUuidJavaLibraryAccessors getJava() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComFasterxmlUuidJavaLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComFasterxmlUuidJavaLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlUuidJavaUuidLibraryAccessors laccForComFasterxmlUuidJavaUuidLibraryAccessors = new ComFasterxmlUuidJavaUuidLibraryAccessors(owner);

        public ComFasterxmlUuidJavaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.fasterxml.uuid.java.uuid</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComFasterxmlUuidJavaUuidLibraryAccessors getUuid() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComFasterxmlUuidJavaUuidLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComFasterxmlUuidJavaUuidLibraryAccessors extends SubDependencyFactory {

        public ComFasterxmlUuidJavaUuidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>generator</b> with <b>com.fasterxml.uuid:java-uuid-generator</b> coordinates and
         * with version reference <b>com.fasterxml.uuid.java.uuid.generator</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getGenerator() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.fasterxml.uuid.java.uuid.generator");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComGithubLibraryAccessors extends SubDependencyFactory {
        private final ComGithubBenLibraryAccessors laccForComGithubBenLibraryAccessors = new ComGithubBenLibraryAccessors(owner);
        private final ComGithubGrowthbookLibraryAccessors laccForComGithubGrowthbookLibraryAccessors = new ComGithubGrowthbookLibraryAccessors(owner);
        private final ComGithubIshugaliyLibraryAccessors laccForComGithubIshugaliyLibraryAccessors = new ComGithubIshugaliyLibraryAccessors(owner);
        private final ComGithubJsqlparserLibraryAccessors laccForComGithubJsqlparserLibraryAccessors = new ComGithubJsqlparserLibraryAccessors(owner);
        private final ComGithubLoki4jLibraryAccessors laccForComGithubLoki4jLibraryAccessors = new ComGithubLoki4jLibraryAccessors(owner);

        public ComGithubLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.github.ben</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComGithubBenLibraryAccessors getBen() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComGithubBenLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.github.growthbook</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComGithubGrowthbookLibraryAccessors getGrowthbook() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComGithubGrowthbookLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.github.ishugaliy</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComGithubIshugaliyLibraryAccessors getIshugaliy() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComGithubIshugaliyLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.github.jsqlparser</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComGithubJsqlparserLibraryAccessors getJsqlparser() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComGithubJsqlparserLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.github.loki4j</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComGithubLoki4jLibraryAccessors getLoki4j() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComGithubLoki4jLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComGithubBenLibraryAccessors extends SubDependencyFactory {
        private final ComGithubBenManesLibraryAccessors laccForComGithubBenManesLibraryAccessors = new ComGithubBenManesLibraryAccessors(owner);

        public ComGithubBenLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.github.ben.manes</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComGithubBenManesLibraryAccessors getManes() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComGithubBenManesLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComGithubBenManesLibraryAccessors extends SubDependencyFactory {
        private final ComGithubBenManesCaffeineLibraryAccessors laccForComGithubBenManesCaffeineLibraryAccessors = new ComGithubBenManesCaffeineLibraryAccessors(owner);

        public ComGithubBenManesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.github.ben.manes.caffeine</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComGithubBenManesCaffeineLibraryAccessors getCaffeine() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComGithubBenManesCaffeineLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComGithubBenManesCaffeineLibraryAccessors extends SubDependencyFactory {

        public ComGithubBenManesCaffeineLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>caffeine</b> with <b>com.github.ben-manes.caffeine:caffeine</b> coordinates and
         * with version reference <b>com.github.ben.manes.caffeine.caffeine</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCaffeine() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.github.ben.manes.caffeine.caffeine");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComGithubGrowthbookLibraryAccessors extends SubDependencyFactory {
        private final ComGithubGrowthbookGrowthbookLibraryAccessors laccForComGithubGrowthbookGrowthbookLibraryAccessors = new ComGithubGrowthbookGrowthbookLibraryAccessors(owner);

        public ComGithubGrowthbookLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.github.growthbook.growthbook</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComGithubGrowthbookGrowthbookLibraryAccessors getGrowthbook() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComGithubGrowthbookGrowthbookLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComGithubGrowthbookGrowthbookLibraryAccessors extends SubDependencyFactory {
        private final ComGithubGrowthbookGrowthbookSdkLibraryAccessors laccForComGithubGrowthbookGrowthbookSdkLibraryAccessors = new ComGithubGrowthbookGrowthbookSdkLibraryAccessors(owner);

        public ComGithubGrowthbookGrowthbookLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.github.growthbook.growthbook.sdk</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComGithubGrowthbookGrowthbookSdkLibraryAccessors getSdk() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComGithubGrowthbookGrowthbookSdkLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComGithubGrowthbookGrowthbookSdkLibraryAccessors extends SubDependencyFactory {

        public ComGithubGrowthbookGrowthbookSdkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>java</b> with <b>com.github.growthbook:growthbook-sdk-java</b> coordinates and
         * with version reference <b>com.github.growthbook.growthbook.sdk.java</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJava() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.github.growthbook.growthbook.sdk.java");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComGithubIshugaliyLibraryAccessors extends SubDependencyFactory {
        private final ComGithubIshugaliyAllgoodLibraryAccessors laccForComGithubIshugaliyAllgoodLibraryAccessors = new ComGithubIshugaliyAllgoodLibraryAccessors(owner);

        public ComGithubIshugaliyLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.github.ishugaliy.allgood</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComGithubIshugaliyAllgoodLibraryAccessors getAllgood() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComGithubIshugaliyAllgoodLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComGithubIshugaliyAllgoodLibraryAccessors extends SubDependencyFactory {
        private final ComGithubIshugaliyAllgoodConsistentLibraryAccessors laccForComGithubIshugaliyAllgoodConsistentLibraryAccessors = new ComGithubIshugaliyAllgoodConsistentLibraryAccessors(owner);

        public ComGithubIshugaliyAllgoodLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.github.ishugaliy.allgood.consistent</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComGithubIshugaliyAllgoodConsistentLibraryAccessors getConsistent() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComGithubIshugaliyAllgoodConsistentLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComGithubIshugaliyAllgoodConsistentLibraryAccessors extends SubDependencyFactory {

        public ComGithubIshugaliyAllgoodConsistentLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>hash</b> with <b>com.github.ishugaliy:allgood-consistent-hash</b> coordinates and
         * with version reference <b>com.github.ishugaliy.allgood.consistent.hash</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getHash() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.github.ishugaliy.allgood.consistent.hash");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComGithubJsqlparserLibraryAccessors extends SubDependencyFactory {

        public ComGithubJsqlparserLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jsqlparser</b> with <b>com.github.jsqlparser:jsqlparser</b> coordinates and
         * with version reference <b>com.github.jsqlparser.jsqlparser</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJsqlparser() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.github.jsqlparser.jsqlparser");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComGithubLoki4jLibraryAccessors extends SubDependencyFactory {
        private final ComGithubLoki4jLokiLibraryAccessors laccForComGithubLoki4jLokiLibraryAccessors = new ComGithubLoki4jLokiLibraryAccessors(owner);

        public ComGithubLoki4jLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.github.loki4j.loki</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComGithubLoki4jLokiLibraryAccessors getLoki() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComGithubLoki4jLokiLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComGithubLoki4jLokiLibraryAccessors extends SubDependencyFactory {
        private final ComGithubLoki4jLokiLogbackLibraryAccessors laccForComGithubLoki4jLokiLogbackLibraryAccessors = new ComGithubLoki4jLokiLogbackLibraryAccessors(owner);

        public ComGithubLoki4jLokiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.github.loki4j.loki.logback</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComGithubLoki4jLokiLogbackLibraryAccessors getLogback() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComGithubLoki4jLokiLogbackLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComGithubLoki4jLokiLogbackLibraryAccessors extends SubDependencyFactory {

        public ComGithubLoki4jLokiLogbackLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>appender</b> with <b>com.github.loki4j:loki-logback-appender</b> coordinates and
         * with version reference <b>com.github.loki4j.loki.logback.appender</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getAppender() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.github.loki4j.loki.logback.appender");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComGoogleLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleGuavaLibraryAccessors laccForComGoogleGuavaLibraryAccessors = new ComGoogleGuavaLibraryAccessors(owner);
        private final ComGoogleProtobufLibraryAccessors laccForComGoogleProtobufLibraryAccessors = new ComGoogleProtobufLibraryAccessors(owner);

        public ComGoogleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.google.guava</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComGoogleGuavaLibraryAccessors getGuava() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComGoogleGuavaLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.google.protobuf</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComGoogleProtobufLibraryAccessors getProtobuf() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComGoogleProtobufLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComGoogleGuavaLibraryAccessors extends SubDependencyFactory {

        public ComGoogleGuavaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>guava</b> with <b>com.google.guava:guava</b> coordinates and
         * with version reference <b>guava.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getGuava() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.google.guava.guava");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComGoogleProtobufLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleProtobufProtobufLibraryAccessors laccForComGoogleProtobufProtobufLibraryAccessors = new ComGoogleProtobufProtobufLibraryAccessors(owner);

        public ComGoogleProtobufLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.google.protobuf.protobuf</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComGoogleProtobufProtobufLibraryAccessors getProtobuf() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComGoogleProtobufProtobufLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComGoogleProtobufProtobufLibraryAccessors extends SubDependencyFactory {

        public ComGoogleProtobufProtobufLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>java</b> with <b>com.google.protobuf:protobuf-java</b> coordinates and
         * with version reference <b>com.google.protobuf.protobuf.java</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJava() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.google.protobuf.protobuf.java");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComJaywayLibraryAccessors extends SubDependencyFactory {
        private final ComJaywayJsonpathLibraryAccessors laccForComJaywayJsonpathLibraryAccessors = new ComJaywayJsonpathLibraryAccessors(owner);

        public ComJaywayLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.jayway.jsonpath</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComJaywayJsonpathLibraryAccessors getJsonpath() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComJaywayJsonpathLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComJaywayJsonpathLibraryAccessors extends SubDependencyFactory {
        private final ComJaywayJsonpathJsonLibraryAccessors laccForComJaywayJsonpathJsonLibraryAccessors = new ComJaywayJsonpathJsonLibraryAccessors(owner);

        public ComJaywayJsonpathLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.jayway.jsonpath.json</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComJaywayJsonpathJsonLibraryAccessors getJson() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComJaywayJsonpathJsonLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComJaywayJsonpathJsonLibraryAccessors extends SubDependencyFactory {

        public ComJaywayJsonpathJsonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>path</b> with <b>com.jayway.jsonpath:json-path</b> coordinates and
         * with version <b>2.9.0</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getPath() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.jayway.jsonpath.json.path");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComSquareupLibraryAccessors extends SubDependencyFactory {
        private final ComSquareupOkhttp3LibraryAccessors laccForComSquareupOkhttp3LibraryAccessors = new ComSquareupOkhttp3LibraryAccessors(owner);

        public ComSquareupLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.squareup.okhttp3</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComSquareupOkhttp3LibraryAccessors getOkhttp3() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComSquareupOkhttp3LibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComSquareupOkhttp3LibraryAccessors extends SubDependencyFactory {

        public ComSquareupOkhttp3LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>mockwebserver</b> with <b>com.squareup.okhttp3:mockwebserver</b> coordinates and
         * with version reference <b>okhttp.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getMockwebserver() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.squareup.okhttp3.mockwebserver");
        }

        /**
         * Dependency provider for <b>okhttp</b> with <b>com.squareup.okhttp3:okhttp</b> coordinates and
         * with version reference <b>okhttp.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getOkhttp() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.squareup.okhttp3.okhttp");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComSunLibraryAccessors extends SubDependencyFactory {
        private final ComSunXmlLibraryAccessors laccForComSunXmlLibraryAccessors = new ComSunXmlLibraryAccessors(owner);

        public ComSunLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.sun.xml</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComSunXmlLibraryAccessors getXml() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComSunXmlLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComSunXmlLibraryAccessors extends SubDependencyFactory {
        private final ComSunXmlBindLibraryAccessors laccForComSunXmlBindLibraryAccessors = new ComSunXmlBindLibraryAccessors(owner);

        public ComSunXmlLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.sun.xml.bind</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComSunXmlBindLibraryAccessors getBind() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComSunXmlBindLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComSunXmlBindLibraryAccessors extends SubDependencyFactory {
        private final ComSunXmlBindJaxbLibraryAccessors laccForComSunXmlBindJaxbLibraryAccessors = new ComSunXmlBindJaxbLibraryAccessors(owner);

        public ComSunXmlBindLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.sun.xml.bind.jaxb</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComSunXmlBindJaxbLibraryAccessors getJaxb() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComSunXmlBindJaxbLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComSunXmlBindJaxbLibraryAccessors extends SubDependencyFactory {

        public ComSunXmlBindJaxbLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>com.sun.xml.bind:jaxb-core</b> coordinates and
         * with version reference <b>jaxb.version.impl</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCore() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.sun.xml.bind.jaxb.core");
        }

        /**
         * Dependency provider for <b>impl</b> with <b>com.sun.xml.bind:jaxb-impl</b> coordinates and
         * with version reference <b>jaxb.version.impl</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getImpl() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.sun.xml.bind.jaxb.impl");
        }

        /**
         * Dependency provider for <b>xjc</b> with <b>com.sun.xml.bind:jaxb-xjc</b> coordinates and
         * with version reference <b>jaxb.version.impl</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getXjc() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.sun.xml.bind.jaxb.xjc");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComZaxxerLibraryAccessors extends SubDependencyFactory {

        public ComZaxxerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>hikaricp</b> with <b>com.zaxxer:HikariCP</b> coordinates and
         * with version reference <b>com.zaxxer.hikaricp</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getHikaricp() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.zaxxer.hikaricp");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class CommonsLibraryAccessors extends SubDependencyFactory {
        private final CommonsIoLibraryAccessors laccForCommonsIoLibraryAccessors = new CommonsIoLibraryAccessors(owner);

        public CommonsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>codec</b> with <b>commons-codec:commons-codec</b> coordinates and
         * with version <b>1.17.1</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCodec() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("commons.codec");
        }

        /**
         * Dependency provider for <b>configuration</b> with <b>commons-configuration:commons-configuration</b> coordinates and
         * with version <b>1.10</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getConfiguration() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("commons.configuration");
        }

        /**
         * Dependency provider for <b>csv</b> with <b>org.apache.commons:commons-csv</b> coordinates and
         * with version <b>1.14.1</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCsv() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("commons.csv");
        }

        /**
         * Group of libraries at <b>commons.io</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public CommonsIoLibraryAccessors getIo() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForCommonsIoLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class CommonsIoLibraryAccessors extends SubDependencyFactory {
        private final CommonsIoCommonsLibraryAccessors laccForCommonsIoCommonsLibraryAccessors = new CommonsIoCommonsLibraryAccessors(owner);

        public CommonsIoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>commons.io.commons</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public CommonsIoCommonsLibraryAccessors getCommons() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForCommonsIoCommonsLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class CommonsIoCommonsLibraryAccessors extends SubDependencyFactory {

        public CommonsIoCommonsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>io</b> with <b>commons-io:commons-io</b> coordinates and
         * with version reference <b>commons.io.commons.io</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getIo() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("commons.io.commons.io");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class CrptLibraryAccessors extends SubDependencyFactory {
        private final CrptBllkLibraryAccessors laccForCrptBllkLibraryAccessors = new CrptBllkLibraryAccessors(owner);

        public CrptLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>crpt.bllk</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public CrptBllkLibraryAccessors getBllk() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForCrptBllkLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
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
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public CrptBllkFeignLibraryAccessors getFeign() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForCrptBllkFeignLibraryAccessors;
        }

        /**
         * Group of libraries at <b>crpt.bllk.header</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public CrptBllkHeaderLibraryAccessors getHeader() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForCrptBllkHeaderLibraryAccessors;
        }

        /**
         * Group of libraries at <b>crpt.bllk.logging</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public CrptBllkLoggingLibraryAccessors getLogging() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForCrptBllkLoggingLibraryAccessors;
        }

        /**
         * Group of libraries at <b>crpt.bllk.monitoring</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public CrptBllkMonitoringLibraryAccessors getMonitoring() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForCrptBllkMonitoringLibraryAccessors;
        }

        /**
         * Group of libraries at <b>crpt.bllk.swagger</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public CrptBllkSwaggerLibraryAccessors getSwagger() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForCrptBllkSwaggerLibraryAccessors;
        }

        /**
         * Group of libraries at <b>crpt.bllk.unified</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public CrptBllkUnifiedLibraryAccessors getUnified() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForCrptBllkUnifiedLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class CrptBllkFeignLibraryAccessors extends SubDependencyFactory {
        private final CrptBllkFeignWebmvcLibraryAccessors laccForCrptBllkFeignWebmvcLibraryAccessors = new CrptBllkFeignWebmvcLibraryAccessors(owner);

        public CrptBllkFeignLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>crpt.bllk.feign.webmvc</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public CrptBllkFeignWebmvcLibraryAccessors getWebmvc() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForCrptBllkFeignWebmvcLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class CrptBllkFeignWebmvcLibraryAccessors extends SubDependencyFactory {

        public CrptBllkFeignWebmvcLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>autoconfigure</b> with <b>ru.crpt.bllk:bllk-feign-webmvc-autoconfigure</b> coordinates and
         * with version reference <b>crpt.bllk.common.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getAutoconfigure() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("crpt.bllk.feign.webmvc.autoconfigure");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class CrptBllkHeaderLibraryAccessors extends SubDependencyFactory {
        private final CrptBllkHeaderForwardLibraryAccessors laccForCrptBllkHeaderForwardLibraryAccessors = new CrptBllkHeaderForwardLibraryAccessors(owner);

        public CrptBllkHeaderLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>crpt.bllk.header.forward</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public CrptBllkHeaderForwardLibraryAccessors getForward() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForCrptBllkHeaderForwardLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class CrptBllkHeaderForwardLibraryAccessors extends SubDependencyFactory {

        public CrptBllkHeaderForwardLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>autoconfigure</b> with <b>ru.crpt.bllk:bllk-header-forward-webmvc-autoconfigure</b> coordinates and
         * with version reference <b>crpt.bllk.common.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getAutoconfigure() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("crpt.bllk.header.forward.autoconfigure");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class CrptBllkLoggingLibraryAccessors extends SubDependencyFactory {

        public CrptBllkLoggingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>autoconfigure</b> with <b>ru.crpt.bllk:bllk-unified-logging-webmvc-autoconfigure</b> coordinates and
         * with version reference <b>crpt.bllk.common.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getAutoconfigure() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("crpt.bllk.logging.autoconfigure");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class CrptBllkMonitoringLibraryAccessors extends SubDependencyFactory {

        public CrptBllkMonitoringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>autoconfigure</b> with <b>ru.crpt.bllk:bllk-monitoring-webmvc-autoconfigure</b> coordinates and
         * with version reference <b>crpt.bllk.common.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getAutoconfigure() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("crpt.bllk.monitoring.autoconfigure");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class CrptBllkSwaggerLibraryAccessors extends SubDependencyFactory {

        public CrptBllkSwaggerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>autoconfigure</b> with <b>ru.crpt.bllk:bllk-swagger-autoconfigure</b> coordinates and
         * with version reference <b>crpt.bllk.common.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getAutoconfigure() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("crpt.bllk.swagger.autoconfigure");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class CrptBllkUnifiedLibraryAccessors extends SubDependencyFactory {
        private final CrptBllkUnifiedLoggingLibraryAccessors laccForCrptBllkUnifiedLoggingLibraryAccessors = new CrptBllkUnifiedLoggingLibraryAccessors(owner);

        public CrptBllkUnifiedLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>crpt.bllk.unified.logging</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public CrptBllkUnifiedLoggingLibraryAccessors getLogging() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForCrptBllkUnifiedLoggingLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class CrptBllkUnifiedLoggingLibraryAccessors extends SubDependencyFactory {
        private final CrptBllkUnifiedLoggingFeignLibraryAccessors laccForCrptBllkUnifiedLoggingFeignLibraryAccessors = new CrptBllkUnifiedLoggingFeignLibraryAccessors(owner);

        public CrptBllkUnifiedLoggingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>crpt.bllk.unified.logging.feign</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public CrptBllkUnifiedLoggingFeignLibraryAccessors getFeign() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForCrptBllkUnifiedLoggingFeignLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class CrptBllkUnifiedLoggingFeignLibraryAccessors extends SubDependencyFactory {

        public CrptBllkUnifiedLoggingFeignLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>autoconfigure</b> with <b>ru.crpt.bllk:bllk-unified-logging-feign-autoconfigure</b> coordinates and
         * with version reference <b>crpt.bllk.common.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getAutoconfigure() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("crpt.bllk.unified.logging.feign.autoconfigure");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class HibernateLibraryAccessors extends SubDependencyFactory {

        public HibernateLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jpamodelgen</b> with <b>org.hibernate:hibernate-jpamodelgen</b> coordinates and
         * with version reference <b>hibernate.jpa.model.gen.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJpamodelgen() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("hibernate.jpamodelgen");
        }

        /**
         * Dependency provider for <b>types</b> with <b>io.hypersistence:hypersistence-utils-hibernate-63</b> coordinates and
         * with version reference <b>hibernate.types.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getTypes() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("hibernate.types");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
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
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoDebeziumLibraryAccessors getDebezium() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoDebeziumLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.github</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoGithubLibraryAccessors getGithub() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoGithubLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.jsonwebtoken</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoJsonwebtokenLibraryAccessors getJsonwebtoken() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoJsonwebtokenLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.micrometer</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoMicrometerLibraryAccessors getMicrometer() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoMicrometerLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.mockk</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoMockkLibraryAccessors getMockk() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoMockkLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.netty</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoNettyLibraryAccessors getNetty() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoNettyLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.opentelemetry</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoOpentelemetryLibraryAccessors getOpentelemetry() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoOpentelemetryLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.projectreactor</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoProjectreactorLibraryAccessors getProjectreactor() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoProjectreactorLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.qameta</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoQametaLibraryAccessors getQameta() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoQametaLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.temporal</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoTemporalLibraryAccessors getTemporal() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoTemporalLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.zonky</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoZonkyLibraryAccessors getZonky() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoZonkyLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoDebeziumLibraryAccessors extends SubDependencyFactory {
        private final IoDebeziumDebeziumLibraryAccessors laccForIoDebeziumDebeziumLibraryAccessors = new IoDebeziumDebeziumLibraryAccessors(owner);

        public IoDebeziumLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.debezium.debezium</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoDebeziumDebeziumLibraryAccessors getDebezium() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoDebeziumDebeziumLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoDebeziumDebeziumLibraryAccessors extends SubDependencyFactory {
        private final IoDebeziumDebeziumConnectorLibraryAccessors laccForIoDebeziumDebeziumConnectorLibraryAccessors = new IoDebeziumDebeziumConnectorLibraryAccessors(owner);
        private final IoDebeziumDebeziumStorageLibraryAccessors laccForIoDebeziumDebeziumStorageLibraryAccessors = new IoDebeziumDebeziumStorageLibraryAccessors(owner);

        public IoDebeziumDebeziumLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>api</b> with <b>io.debezium:debezium-api</b> coordinates and
         * with version reference <b>io.debezium.debezium.api</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getApi() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.debezium.debezium.api");
        }

        /**
         * Dependency provider for <b>embedded</b> with <b>io.debezium:debezium-embedded</b> coordinates and
         * with version reference <b>io.debezium.debezium.embedded</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getEmbedded() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.debezium.debezium.embedded");
        }

        /**
         * Group of libraries at <b>io.debezium.debezium.connector</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoDebeziumDebeziumConnectorLibraryAccessors getConnector() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoDebeziumDebeziumConnectorLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.debezium.debezium.storage</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoDebeziumDebeziumStorageLibraryAccessors getStorage() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoDebeziumDebeziumStorageLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoDebeziumDebeziumConnectorLibraryAccessors extends SubDependencyFactory {

        public IoDebeziumDebeziumConnectorLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>postgres</b> with <b>io.debezium:debezium-connector-postgres</b> coordinates and
         * with version reference <b>io.debezium.debezium.connector.postgres</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getPostgres() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.debezium.debezium.connector.postgres");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoDebeziumDebeziumStorageLibraryAccessors extends SubDependencyFactory {

        public IoDebeziumDebeziumStorageLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jdbc</b> with <b>io.debezium:debezium-storage-jdbc</b> coordinates and
         * with version reference <b>io.debezium.debezium.storage.jdbc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJdbc() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.debezium.debezium.storage.jdbc");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoGithubLibraryAccessors extends SubDependencyFactory {
        private final IoGithubMicroutilsLibraryAccessors laccForIoGithubMicroutilsLibraryAccessors = new IoGithubMicroutilsLibraryAccessors(owner);
        private final IoGithubResilience4jLibraryAccessors laccForIoGithubResilience4jLibraryAccessors = new IoGithubResilience4jLibraryAccessors(owner);

        public IoGithubLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.github.microutils</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoGithubMicroutilsLibraryAccessors getMicroutils() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoGithubMicroutilsLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.github.resilience4j</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoGithubResilience4jLibraryAccessors getResilience4j() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoGithubResilience4jLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoGithubMicroutilsLibraryAccessors extends SubDependencyFactory {
        private final IoGithubMicroutilsKotlinLibraryAccessors laccForIoGithubMicroutilsKotlinLibraryAccessors = new IoGithubMicroutilsKotlinLibraryAccessors(owner);

        public IoGithubMicroutilsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.github.microutils.kotlin</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoGithubMicroutilsKotlinLibraryAccessors getKotlin() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoGithubMicroutilsKotlinLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoGithubMicroutilsKotlinLibraryAccessors extends SubDependencyFactory {
        private final IoGithubMicroutilsKotlinLoggingLibraryAccessors laccForIoGithubMicroutilsKotlinLoggingLibraryAccessors = new IoGithubMicroutilsKotlinLoggingLibraryAccessors(owner);

        public IoGithubMicroutilsKotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.github.microutils.kotlin.logging</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoGithubMicroutilsKotlinLoggingLibraryAccessors getLogging() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoGithubMicroutilsKotlinLoggingLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoGithubMicroutilsKotlinLoggingLibraryAccessors extends SubDependencyFactory {

        public IoGithubMicroutilsKotlinLoggingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jvm</b> with <b>io.github.microutils:kotlin-logging-jvm</b> coordinates and
         * with version reference <b>io.github.microutils.kotlin.logging.jvm</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJvm() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.github.microutils.kotlin.logging.jvm");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoGithubResilience4jLibraryAccessors extends SubDependencyFactory {
        private final IoGithubResilience4jResilience4jLibraryAccessors laccForIoGithubResilience4jResilience4jLibraryAccessors = new IoGithubResilience4jResilience4jLibraryAccessors(owner);

        public IoGithubResilience4jLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.github.resilience4j.resilience4j</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoGithubResilience4jResilience4jLibraryAccessors getResilience4j() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoGithubResilience4jResilience4jLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoGithubResilience4jResilience4jLibraryAccessors extends SubDependencyFactory {

        public IoGithubResilience4jResilience4jLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>io.github.resilience4j:resilience4j-core</b> coordinates and
         * with version reference <b>io.github.resilience4j.resilience4j.core</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCore() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.github.resilience4j.resilience4j.core");
        }

        /**
         * Dependency provider for <b>kotlin</b> with <b>io.github.resilience4j:resilience4j-kotlin</b> coordinates and
         * with version reference <b>io.github.resilience4j.resilience4j.kotlin</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getKotlin() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.github.resilience4j.resilience4j.kotlin");
        }

        /**
         * Dependency provider for <b>retry</b> with <b>io.github.resilience4j:resilience4j-retry</b> coordinates and
         * with version reference <b>io.github.resilience4j.resilience4j.retry</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getRetry() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.github.resilience4j.resilience4j.retry");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoJsonwebtokenLibraryAccessors extends SubDependencyFactory {
        private final IoJsonwebtokenJjwtLibraryAccessors laccForIoJsonwebtokenJjwtLibraryAccessors = new IoJsonwebtokenJjwtLibraryAccessors(owner);

        public IoJsonwebtokenLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.jsonwebtoken.jjwt</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoJsonwebtokenJjwtLibraryAccessors getJjwt() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoJsonwebtokenJjwtLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoJsonwebtokenJjwtLibraryAccessors extends SubDependencyFactory {

        public IoJsonwebtokenJjwtLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>api</b> with <b>io.jsonwebtoken:jjwt-api</b> coordinates and
         * with version reference <b>io.jsonwebtoken.jjwt.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getApi() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.jsonwebtoken.jjwt.api");
        }

        /**
         * Dependency provider for <b>impl</b> with <b>io.jsonwebtoken:jjwt-impl</b> coordinates and
         * with version reference <b>io.jsonwebtoken.jjwt.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getImpl() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.jsonwebtoken.jjwt.impl");
        }

        /**
         * Dependency provider for <b>jackson</b> with <b>io.jsonwebtoken:jjwt-jackson</b> coordinates and
         * with version reference <b>io.jsonwebtoken.jjwt.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJackson() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.jsonwebtoken.jjwt.jackson");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoMicrometerLibraryAccessors extends SubDependencyFactory {
        private final IoMicrometerMicrometerLibraryAccessors laccForIoMicrometerMicrometerLibraryAccessors = new IoMicrometerMicrometerLibraryAccessors(owner);

        public IoMicrometerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.micrometer.micrometer</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoMicrometerMicrometerLibraryAccessors getMicrometer() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoMicrometerMicrometerLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoMicrometerMicrometerLibraryAccessors extends SubDependencyFactory {
        private final IoMicrometerMicrometerRegistryLibraryAccessors laccForIoMicrometerMicrometerRegistryLibraryAccessors = new IoMicrometerMicrometerRegistryLibraryAccessors(owner);

        public IoMicrometerMicrometerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>io.micrometer:micrometer-core</b> coordinates and
         * with version reference <b>io.micrometer.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCore() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.micrometer.micrometer.core");
        }

        /**
         * Group of libraries at <b>io.micrometer.micrometer.registry</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoMicrometerMicrometerRegistryLibraryAccessors getRegistry() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoMicrometerMicrometerRegistryLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoMicrometerMicrometerRegistryLibraryAccessors extends SubDependencyFactory {

        public IoMicrometerMicrometerRegistryLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>prometheus</b> with <b>io.micrometer:micrometer-registry-prometheus</b> coordinates and
         * with version reference <b>io.micrometer.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getPrometheus() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.micrometer.micrometer.registry.prometheus");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoMockkLibraryAccessors extends SubDependencyFactory {

        public IoMockkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>mockk</b> with <b>io.mockk:mockk</b> coordinates and
         * with version reference <b>mockk.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getMockk() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.mockk.mockk");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoNettyLibraryAccessors extends SubDependencyFactory {
        private final IoNettyNettyLibraryAccessors laccForIoNettyNettyLibraryAccessors = new IoNettyNettyLibraryAccessors(owner);

        public IoNettyLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.netty.netty</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoNettyNettyLibraryAccessors getNetty() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoNettyNettyLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoNettyNettyLibraryAccessors extends SubDependencyFactory {
        private final IoNettyNettyCodecLibraryAccessors laccForIoNettyNettyCodecLibraryAccessors = new IoNettyNettyCodecLibraryAccessors(owner);

        public IoNettyNettyLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.netty.netty.codec</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoNettyNettyCodecLibraryAccessors getCodec() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoNettyNettyCodecLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoNettyNettyCodecLibraryAccessors extends SubDependencyFactory {

        public IoNettyNettyCodecLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>http</b> with <b>io.netty:netty-codec-http</b> coordinates and
         * with version reference <b>io.netty.netty.codec.http</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getHttp() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.netty.netty.codec.http");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoOpentelemetryLibraryAccessors extends SubDependencyFactory {
        private final IoOpentelemetryInstrumentationLibraryAccessors laccForIoOpentelemetryInstrumentationLibraryAccessors = new IoOpentelemetryInstrumentationLibraryAccessors(owner);
        private final IoOpentelemetryOpentelemetryLibraryAccessors laccForIoOpentelemetryOpentelemetryLibraryAccessors = new IoOpentelemetryOpentelemetryLibraryAccessors(owner);

        public IoOpentelemetryLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.opentelemetry.instrumentation</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoOpentelemetryInstrumentationLibraryAccessors getInstrumentation() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoOpentelemetryInstrumentationLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.opentelemetry.opentelemetry</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoOpentelemetryOpentelemetryLibraryAccessors getOpentelemetry() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoOpentelemetryOpentelemetryLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoOpentelemetryInstrumentationLibraryAccessors extends SubDependencyFactory {
        private final IoOpentelemetryInstrumentationOpentelemetryLibraryAccessors laccForIoOpentelemetryInstrumentationOpentelemetryLibraryAccessors = new IoOpentelemetryInstrumentationOpentelemetryLibraryAccessors(owner);

        public IoOpentelemetryInstrumentationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.opentelemetry.instrumentation.opentelemetry</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoOpentelemetryInstrumentationOpentelemetryLibraryAccessors getOpentelemetry() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoOpentelemetryInstrumentationOpentelemetryLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoOpentelemetryInstrumentationOpentelemetryLibraryAccessors extends SubDependencyFactory {
        private final IoOpentelemetryInstrumentationOpentelemetryInstrumentationLibraryAccessors laccForIoOpentelemetryInstrumentationOpentelemetryInstrumentationLibraryAccessors = new IoOpentelemetryInstrumentationOpentelemetryInstrumentationLibraryAccessors(owner);

        public IoOpentelemetryInstrumentationOpentelemetryLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.opentelemetry.instrumentation.opentelemetry.instrumentation</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoOpentelemetryInstrumentationOpentelemetryInstrumentationLibraryAccessors getInstrumentation() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoOpentelemetryInstrumentationOpentelemetryInstrumentationLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoOpentelemetryInstrumentationOpentelemetryInstrumentationLibraryAccessors extends SubDependencyFactory {

        public IoOpentelemetryInstrumentationOpentelemetryInstrumentationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>bom</b> with <b>io.opentelemetry.instrumentation:opentelemetry-instrumentation-bom</b> coordinates and
         * with version reference <b>opentelemetry.instrumentation.bom</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getBom() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.opentelemetry.instrumentation.opentelemetry.instrumentation.bom");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
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
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCommon() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.opentelemetry.opentelemetry.common");
        }

        /**
         * Group of libraries at <b>io.opentelemetry.opentelemetry.exporter</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoOpentelemetryOpentelemetryExporterLibraryAccessors getExporter() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoOpentelemetryOpentelemetryExporterLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.opentelemetry.opentelemetry.opentracing</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoOpentelemetryOpentelemetryOpentracingLibraryAccessors getOpentracing() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoOpentelemetryOpentelemetryOpentracingLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.opentelemetry.opentelemetry.sdk</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoOpentelemetryOpentelemetrySdkLibraryAccessors getSdk() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoOpentelemetryOpentelemetrySdkLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoOpentelemetryOpentelemetryExporterLibraryAccessors extends SubDependencyFactory {
        private final IoOpentelemetryOpentelemetryExporterOtlpLibraryAccessors laccForIoOpentelemetryOpentelemetryExporterOtlpLibraryAccessors = new IoOpentelemetryOpentelemetryExporterOtlpLibraryAccessors(owner);
        private final IoOpentelemetryOpentelemetryExporterSenderLibraryAccessors laccForIoOpentelemetryOpentelemetryExporterSenderLibraryAccessors = new IoOpentelemetryOpentelemetryExporterSenderLibraryAccessors(owner);

        public IoOpentelemetryOpentelemetryExporterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>common</b> with <b>io.opentelemetry:opentelemetry-exporter-common</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCommon() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.opentelemetry.opentelemetry.exporter.common");
        }

        /**
         * Group of libraries at <b>io.opentelemetry.opentelemetry.exporter.otlp</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoOpentelemetryOpentelemetryExporterOtlpLibraryAccessors getOtlp() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoOpentelemetryOpentelemetryExporterOtlpLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.opentelemetry.opentelemetry.exporter.sender</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoOpentelemetryOpentelemetryExporterSenderLibraryAccessors getSender() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoOpentelemetryOpentelemetryExporterSenderLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoOpentelemetryOpentelemetryExporterOtlpLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public IoOpentelemetryOpentelemetryExporterOtlpLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>otlp</b> with <b>io.opentelemetry:opentelemetry-exporter-otlp</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> asProvider() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.opentelemetry.opentelemetry.exporter.otlp");
        }

        /**
         * Dependency provider for <b>common</b> with <b>io.opentelemetry:opentelemetry-exporter-otlp-common</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCommon() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.opentelemetry.opentelemetry.exporter.otlp.common");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoOpentelemetryOpentelemetryExporterSenderLibraryAccessors extends SubDependencyFactory {

        public IoOpentelemetryOpentelemetryExporterSenderLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>okhttp</b> with <b>io.opentelemetry:opentelemetry-exporter-sender-okhttp</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getOkhttp() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.opentelemetry.opentelemetry.exporter.sender.okhttp");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoOpentelemetryOpentelemetryOpentracingLibraryAccessors extends SubDependencyFactory {

        public IoOpentelemetryOpentelemetryOpentracingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>shim</b> with <b>io.opentelemetry:opentelemetry-opentracing-shim</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getShim() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.opentelemetry.opentelemetry.opentracing.shim");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoOpentelemetryOpentelemetrySdkLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public IoOpentelemetryOpentelemetrySdkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>sdk</b> with <b>io.opentelemetry:opentelemetry-sdk</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> asProvider() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.opentelemetry.opentelemetry.sdk");
        }

        /**
         * Dependency provider for <b>common</b> with <b>io.opentelemetry:opentelemetry-sdk-common</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCommon() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.opentelemetry.opentelemetry.sdk.common");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoProjectreactorLibraryAccessors extends SubDependencyFactory {
        private final IoProjectreactorKotlinLibraryAccessors laccForIoProjectreactorKotlinLibraryAccessors = new IoProjectreactorKotlinLibraryAccessors(owner);
        private final IoProjectreactorReactorLibraryAccessors laccForIoProjectreactorReactorLibraryAccessors = new IoProjectreactorReactorLibraryAccessors(owner);

        public IoProjectreactorLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.projectreactor.kotlin</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoProjectreactorKotlinLibraryAccessors getKotlin() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoProjectreactorKotlinLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.projectreactor.reactor</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoProjectreactorReactorLibraryAccessors getReactor() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoProjectreactorReactorLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoProjectreactorKotlinLibraryAccessors extends SubDependencyFactory {
        private final IoProjectreactorKotlinReactorLibraryAccessors laccForIoProjectreactorKotlinReactorLibraryAccessors = new IoProjectreactorKotlinReactorLibraryAccessors(owner);

        public IoProjectreactorKotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.projectreactor.kotlin.reactor</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoProjectreactorKotlinReactorLibraryAccessors getReactor() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoProjectreactorKotlinReactorLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoProjectreactorKotlinReactorLibraryAccessors extends SubDependencyFactory {
        private final IoProjectreactorKotlinReactorKotlinLibraryAccessors laccForIoProjectreactorKotlinReactorKotlinLibraryAccessors = new IoProjectreactorKotlinReactorKotlinLibraryAccessors(owner);

        public IoProjectreactorKotlinReactorLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.projectreactor.kotlin.reactor.kotlin</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoProjectreactorKotlinReactorKotlinLibraryAccessors getKotlin() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoProjectreactorKotlinReactorKotlinLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoProjectreactorKotlinReactorKotlinLibraryAccessors extends SubDependencyFactory {

        public IoProjectreactorKotlinReactorKotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>extensions</b> with <b>io.projectreactor.kotlin:reactor-kotlin-extensions</b> coordinates and
         * with version reference <b>io.projectreactor.kotlin.reactor.kotlin.extensions</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getExtensions() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.projectreactor.kotlin.reactor.kotlin.extensions");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoProjectreactorReactorLibraryAccessors extends SubDependencyFactory {

        public IoProjectreactorReactorLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>io.projectreactor:reactor-core</b> coordinates and
         * with version reference <b>io.projectreactor.reactor.core</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCore() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.projectreactor.reactor.core");
        }

        /**
         * Dependency provider for <b>test</b> with <b>io.projectreactor:reactor-test</b> coordinates and
         * with version reference <b>io.projectreactor.reactor.test</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getTest() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.projectreactor.reactor.test");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoQametaLibraryAccessors extends SubDependencyFactory {
        private final IoQametaAllureLibraryAccessors laccForIoQametaAllureLibraryAccessors = new IoQametaAllureLibraryAccessors(owner);

        public IoQametaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.qameta.allure</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoQametaAllureLibraryAccessors getAllure() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoQametaAllureLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoQametaAllureLibraryAccessors extends SubDependencyFactory {
        private final IoQametaAllureAllureLibraryAccessors laccForIoQametaAllureAllureLibraryAccessors = new IoQametaAllureAllureLibraryAccessors(owner);

        public IoQametaAllureLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.qameta.allure.allure</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoQametaAllureAllureLibraryAccessors getAllure() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoQametaAllureAllureLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
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
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getAssertj() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.qameta.allure.allure.assertj");
        }

        /**
         * Dependency provider for <b>junit5</b> with <b>io.qameta.allure:allure-junit5</b> coordinates and
         * with version reference <b>allure.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJunit5() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.qameta.allure.allure.junit5");
        }

        /**
         * Dependency provider for <b>model</b> with <b>io.qameta.allure:allure-model</b> coordinates and
         * with version reference <b>allure.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getModel() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.qameta.allure.allure.model");
        }

        /**
         * Group of libraries at <b>io.qameta.allure.allure.java</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoQametaAllureAllureJavaLibraryAccessors getJava() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoQametaAllureAllureJavaLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.qameta.allure.allure.junit</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoQametaAllureAllureJunitLibraryAccessors getJunit() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoQametaAllureAllureJunitLibraryAccessors;
        }

        /**
         * Group of libraries at <b>io.qameta.allure.allure.test</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoQametaAllureAllureTestLibraryAccessors getTest() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoQametaAllureAllureTestLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoQametaAllureAllureJavaLibraryAccessors extends SubDependencyFactory {

        public IoQametaAllureAllureJavaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>commons</b> with <b>io.qameta.allure:allure-java-commons</b> coordinates and
         * with version reference <b>allure.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCommons() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.qameta.allure.allure.java.commons");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoQametaAllureAllureJunitLibraryAccessors extends SubDependencyFactory {

        public IoQametaAllureAllureJunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>platform</b> with <b>io.qameta.allure:allure-junit-platform</b> coordinates and
         * with version reference <b>allure.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getPlatform() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.qameta.allure.allure.junit.platform");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoQametaAllureAllureTestLibraryAccessors extends SubDependencyFactory {

        public IoQametaAllureAllureTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>filter</b> with <b>io.qameta.allure:allure-test-filter</b> coordinates and
         * with version reference <b>allure.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getFilter() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.qameta.allure.allure.test.filter");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoTemporalLibraryAccessors extends SubDependencyFactory {
        private final IoTemporalTemporalLibraryAccessors laccForIoTemporalTemporalLibraryAccessors = new IoTemporalTemporalLibraryAccessors(owner);

        public IoTemporalLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.temporal.temporal</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoTemporalTemporalLibraryAccessors getTemporal() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoTemporalTemporalLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoTemporalTemporalLibraryAccessors extends SubDependencyFactory {
        private final IoTemporalTemporalSpringLibraryAccessors laccForIoTemporalTemporalSpringLibraryAccessors = new IoTemporalTemporalSpringLibraryAccessors(owner);

        public IoTemporalTemporalLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>sdk</b> with <b>io.temporal:temporal-sdk</b> coordinates and
         * with version reference <b>temporal.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getSdk() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.temporal.temporal.sdk");
        }

        /**
         * Dependency provider for <b>testing</b> with <b>io.temporal:temporal-testing</b> coordinates and
         * with version reference <b>temporal.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getTesting() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.temporal.temporal.testing");
        }

        /**
         * Group of libraries at <b>io.temporal.temporal.spring</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoTemporalTemporalSpringLibraryAccessors getSpring() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoTemporalTemporalSpringLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoTemporalTemporalSpringLibraryAccessors extends SubDependencyFactory {
        private final IoTemporalTemporalSpringBootLibraryAccessors laccForIoTemporalTemporalSpringBootLibraryAccessors = new IoTemporalTemporalSpringBootLibraryAccessors(owner);

        public IoTemporalTemporalSpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.temporal.temporal.spring.boot</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoTemporalTemporalSpringBootLibraryAccessors getBoot() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoTemporalTemporalSpringBootLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoTemporalTemporalSpringBootLibraryAccessors extends SubDependencyFactory {

        public IoTemporalTemporalSpringBootLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>starter</b> with <b>io.temporal:temporal-spring-boot-starter</b> coordinates and
         * with version reference <b>temporal.spring.boot.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getStarter() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.temporal.temporal.spring.boot.starter");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoZonkyLibraryAccessors extends SubDependencyFactory {
        private final IoZonkyTestLibraryAccessors laccForIoZonkyTestLibraryAccessors = new IoZonkyTestLibraryAccessors(owner);

        public IoZonkyLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.zonky.test</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoZonkyTestLibraryAccessors getTest() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoZonkyTestLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoZonkyTestLibraryAccessors extends SubDependencyFactory {
        private final IoZonkyTestEmbeddedLibraryAccessors laccForIoZonkyTestEmbeddedLibraryAccessors = new IoZonkyTestEmbeddedLibraryAccessors(owner);

        public IoZonkyTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.zonky.test.embedded</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoZonkyTestEmbeddedLibraryAccessors getEmbedded() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoZonkyTestEmbeddedLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoZonkyTestEmbeddedLibraryAccessors extends SubDependencyFactory {
        private final IoZonkyTestEmbeddedPostgresLibraryAccessors laccForIoZonkyTestEmbeddedPostgresLibraryAccessors = new IoZonkyTestEmbeddedPostgresLibraryAccessors(owner);

        public IoZonkyTestEmbeddedLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.zonky.test.embedded.postgres</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoZonkyTestEmbeddedPostgresLibraryAccessors getPostgres() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoZonkyTestEmbeddedPostgresLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoZonkyTestEmbeddedPostgresLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public IoZonkyTestEmbeddedPostgresLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>postgres</b> with <b>io.zonky.test:embedded-postgres</b> coordinates and
         * with version reference <b>embedded.postgres.lib.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> asProvider() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.zonky.test.embedded.postgres");
        }

        /**
         * Dependency provider for <b>binaries</b> with <b>io.zonky.test.postgres:embedded-postgres-binaries-bom</b> coordinates and
         * with version reference <b>embedded.postgres.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getBinaries() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.zonky.test.embedded.postgres.binaries");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JacksonLibraryAccessors extends SubDependencyFactory {
        private final JacksonDataformatLibraryAccessors laccForJacksonDataformatLibraryAccessors = new JacksonDataformatLibraryAccessors(owner);

        public JacksonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>jackson.dataformat</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JacksonDataformatLibraryAccessors getDataformat() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJacksonDataformatLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JacksonDataformatLibraryAccessors extends SubDependencyFactory {

        public JacksonDataformatLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>yaml</b> with <b>com.fasterxml.jackson.dataformat:jackson-dataformat-yaml</b> coordinates and
         * with version reference <b>jackson.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getYaml() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("jackson.dataformat.yaml");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaLibraryAccessors extends SubDependencyFactory {
        private final JakartaAnnotationLibraryAccessors laccForJakartaAnnotationLibraryAccessors = new JakartaAnnotationLibraryAccessors(owner);
        private final JakartaValidationLibraryAccessors laccForJakartaValidationLibraryAccessors = new JakartaValidationLibraryAccessors(owner);
        private final JakartaXmlLibraryAccessors laccForJakartaXmlLibraryAccessors = new JakartaXmlLibraryAccessors(owner);

        public JakartaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>jakarta.annotation</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaAnnotationLibraryAccessors getAnnotation() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaAnnotationLibraryAccessors;
        }

        /**
         * Group of libraries at <b>jakarta.validation</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaValidationLibraryAccessors getValidation() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaValidationLibraryAccessors;
        }

        /**
         * Group of libraries at <b>jakarta.xml</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaXmlLibraryAccessors getXml() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaXmlLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaAnnotationLibraryAccessors extends SubDependencyFactory {
        private final JakartaAnnotationJakartaLibraryAccessors laccForJakartaAnnotationJakartaLibraryAccessors = new JakartaAnnotationJakartaLibraryAccessors(owner);

        public JakartaAnnotationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>jakarta.annotation.jakarta</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaAnnotationJakartaLibraryAccessors getJakarta() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaAnnotationJakartaLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaAnnotationJakartaLibraryAccessors extends SubDependencyFactory {
        private final JakartaAnnotationJakartaAnnotationLibraryAccessors laccForJakartaAnnotationJakartaAnnotationLibraryAccessors = new JakartaAnnotationJakartaAnnotationLibraryAccessors(owner);

        public JakartaAnnotationJakartaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>jakarta.annotation.jakarta.annotation</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaAnnotationJakartaAnnotationLibraryAccessors getAnnotation() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaAnnotationJakartaAnnotationLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaAnnotationJakartaAnnotationLibraryAccessors extends SubDependencyFactory {

        public JakartaAnnotationJakartaAnnotationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>api</b> with <b>jakarta.annotation:jakarta.annotation-api</b> coordinates and
         * with version reference <b>jakarta.annotation.jakarta.annotation.api</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getApi() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("jakarta.annotation.jakarta.annotation.api");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaValidationLibraryAccessors extends SubDependencyFactory {
        private final JakartaValidationJakartaLibraryAccessors laccForJakartaValidationJakartaLibraryAccessors = new JakartaValidationJakartaLibraryAccessors(owner);

        public JakartaValidationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>jakarta.validation.jakarta</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaValidationJakartaLibraryAccessors getJakarta() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaValidationJakartaLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaValidationJakartaLibraryAccessors extends SubDependencyFactory {
        private final JakartaValidationJakartaValidationLibraryAccessors laccForJakartaValidationJakartaValidationLibraryAccessors = new JakartaValidationJakartaValidationLibraryAccessors(owner);

        public JakartaValidationJakartaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>jakarta.validation.jakarta.validation</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaValidationJakartaValidationLibraryAccessors getValidation() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaValidationJakartaValidationLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaValidationJakartaValidationLibraryAccessors extends SubDependencyFactory {

        public JakartaValidationJakartaValidationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>api</b> with <b>jakarta.validation:jakarta.validation-api</b> coordinates and
         * with version reference <b>jakarta.validation.jakarta.validation.api</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getApi() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("jakarta.validation.jakarta.validation.api");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaXmlLibraryAccessors extends SubDependencyFactory {
        private final JakartaXmlBindLibraryAccessors laccForJakartaXmlBindLibraryAccessors = new JakartaXmlBindLibraryAccessors(owner);

        public JakartaXmlLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>jakarta.xml.bind</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaXmlBindLibraryAccessors getBind() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaXmlBindLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaXmlBindLibraryAccessors extends SubDependencyFactory {
        private final JakartaXmlBindJakartaLibraryAccessors laccForJakartaXmlBindJakartaLibraryAccessors = new JakartaXmlBindJakartaLibraryAccessors(owner);

        public JakartaXmlBindLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>jakarta.xml.bind.jakarta</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaXmlBindJakartaLibraryAccessors getJakarta() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaXmlBindJakartaLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaXmlBindJakartaLibraryAccessors extends SubDependencyFactory {
        private final JakartaXmlBindJakartaXmlLibraryAccessors laccForJakartaXmlBindJakartaXmlLibraryAccessors = new JakartaXmlBindJakartaXmlLibraryAccessors(owner);

        public JakartaXmlBindJakartaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>jakarta.xml.bind.jakarta.xml</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaXmlBindJakartaXmlLibraryAccessors getXml() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaXmlBindJakartaXmlLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaXmlBindJakartaXmlLibraryAccessors extends SubDependencyFactory {
        private final JakartaXmlBindJakartaXmlBindLibraryAccessors laccForJakartaXmlBindJakartaXmlBindLibraryAccessors = new JakartaXmlBindJakartaXmlBindLibraryAccessors(owner);

        public JakartaXmlBindJakartaXmlLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>jakarta.xml.bind.jakarta.xml.bind</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaXmlBindJakartaXmlBindLibraryAccessors getBind() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaXmlBindJakartaXmlBindLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaXmlBindJakartaXmlBindLibraryAccessors extends SubDependencyFactory {

        public JakartaXmlBindJakartaXmlBindLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>api</b> with <b>jakarta.xml.bind:jakarta.xml.bind-api</b> coordinates and
         * with version reference <b>jaxb.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getApi() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("jakarta.xml.bind.jakarta.xml.bind.api");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JaninoLibraryAccessors extends SubDependencyFactory {

        public JaninoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>library</b> with <b>org.codehaus.janino:janino</b> coordinates and
         * with version <b>3.1.12</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getLibrary() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("janino.library");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class KotlinLibraryAccessors extends SubDependencyFactory {

        public KotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>allopen</b> with <b>org.jetbrains.kotlin:kotlin-allopen</b> coordinates and
         * with version reference <b>kotlin.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getAllopen() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("kotlin.allopen");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class LogbackLibraryAccessors extends SubDependencyFactory {

        public LogbackLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>classic</b> with <b>ch.qos.logback:logback-classic</b> coordinates and
         * with version reference <b>logback.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getClassic() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("logback.classic");
        }

        /**
         * Dependency provider for <b>core</b> with <b>ch.qos.logback:logback-core</b> coordinates and
         * with version reference <b>logback.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCore() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("logback.core");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class LogstashLibraryAccessors extends SubDependencyFactory {
        private final LogstashLogbackLibraryAccessors laccForLogstashLogbackLibraryAccessors = new LogstashLogbackLibraryAccessors(owner);

        public LogstashLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>logstash.logback</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public LogstashLogbackLibraryAccessors getLogback() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForLogstashLogbackLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class LogstashLogbackLibraryAccessors extends SubDependencyFactory {

        public LogstashLogbackLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>encoder</b> with <b>net.logstash.logback:logstash-logback-encoder</b> coordinates and
         * with version <b>7.4</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getEncoder() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("logstash.logback.encoder");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class MapstructLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public MapstructLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>mapstruct</b> with <b>org.mapstruct:mapstruct</b> coordinates and
         * with version reference <b>mapstruct.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> asProvider() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("mapstruct");
        }

        /**
         * Dependency provider for <b>processor</b> with <b>org.mapstruct:mapstruct-processor</b> coordinates and
         * with version reference <b>mapstruct.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getProcessor() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("mapstruct.processor");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class MinidevLibraryAccessors extends SubDependencyFactory {
        private final MinidevJsonLibraryAccessors laccForMinidevJsonLibraryAccessors = new MinidevJsonLibraryAccessors(owner);

        public MinidevLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>minidev.json</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public MinidevJsonLibraryAccessors getJson() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForMinidevJsonLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class MinidevJsonLibraryAccessors extends SubDependencyFactory {

        public MinidevJsonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>smart</b> with <b>net.minidev:json-smart</b> coordinates and
         * with version <b>2.5.2</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getSmart() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("minidev.json.smart");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class MinioLibraryAccessors extends SubDependencyFactory {

        public MinioLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>clint</b> with <b>io.minio:minio</b> coordinates and
         * with version <b>8.5.10</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getClint() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("minio.clint");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class NimbusLibraryAccessors extends SubDependencyFactory {

        public NimbusLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jwt</b> with <b>com.nimbusds:nimbus-jose-jwt</b> coordinates and
         * with version <b>9.37.2</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJwt() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("nimbus.jwt");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
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
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgApacheLibraryAccessors getApache() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgApacheLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.aspectj</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgAspectjLibraryAccessors getAspectj() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgAspectjLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.assertj</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgAssertjLibraryAccessors getAssertj() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgAssertjLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.asynchttpclient</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgAsynchttpclientLibraryAccessors getAsynchttpclient() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgAsynchttpclientLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.awaitility</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgAwaitilityLibraryAccessors getAwaitility() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgAwaitilityLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.hamcrest</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgHamcrestLibraryAccessors getHamcrest() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgHamcrestLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.jetbrains</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgJetbrainsLibraryAccessors getJetbrains() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgJetbrainsLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.junit</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgJunitLibraryAccessors getJunit() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgJunitLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.liquibase</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgLiquibaseLibraryAccessors getLiquibase() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgLiquibaseLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.lz4</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgLz4LibraryAccessors getLz4() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgLz4LibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.mock</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgMockLibraryAccessors getMock() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgMockLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.mockito</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgMockitoLibraryAccessors getMockito() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgMockitoLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.postgresql</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgPostgresqlLibraryAccessors getPostgresql() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgPostgresqlLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.springdoc</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringdocLibraryAccessors getSpringdoc() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringdocLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.springframework</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringframeworkLibraryAccessors getSpringframework() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringframeworkLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.testcontainers</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgTestcontainersLibraryAccessors getTestcontainers() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgTestcontainersLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgApacheLibraryAccessors extends SubDependencyFactory {
        private final OrgApacheCommonsLibraryAccessors laccForOrgApacheCommonsLibraryAccessors = new OrgApacheCommonsLibraryAccessors(owner);
        private final OrgApacheHttpcomponentsLibraryAccessors laccForOrgApacheHttpcomponentsLibraryAccessors = new OrgApacheHttpcomponentsLibraryAccessors(owner);
        private final OrgApacheKafkaLibraryAccessors laccForOrgApacheKafkaLibraryAccessors = new OrgApacheKafkaLibraryAccessors(owner);
        private final OrgApachePoiLibraryAccessors laccForOrgApachePoiLibraryAccessors = new OrgApachePoiLibraryAccessors(owner);

        public OrgApacheLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.apache.commons</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgApacheCommonsLibraryAccessors getCommons() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgApacheCommonsLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.apache.httpcomponents</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgApacheHttpcomponentsLibraryAccessors getHttpcomponents() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgApacheHttpcomponentsLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.apache.kafka</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgApacheKafkaLibraryAccessors getKafka() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgApacheKafkaLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.apache.poi</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgApachePoiLibraryAccessors getPoi() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgApachePoiLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgApacheCommonsLibraryAccessors extends SubDependencyFactory {
        private final OrgApacheCommonsCommonsLibraryAccessors laccForOrgApacheCommonsCommonsLibraryAccessors = new OrgApacheCommonsCommonsLibraryAccessors(owner);

        public OrgApacheCommonsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>collections4</b> with <b>org.apache.commons:commons-collections4</b> coordinates and
         * with version reference <b>org.apache.commons.collections4</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCollections4() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.apache.commons.collections4");
        }

        /**
         * Dependency provider for <b>lang3</b> with <b>org.apache.commons:commons-lang3</b> coordinates and
         * with version reference <b>org.apache.commons.lang3</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getLang3() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.apache.commons.lang3");
        }

        /**
         * Dependency provider for <b>text</b> with <b>org.apache.commons:commons-text</b> coordinates and
         * with version <b>1.15.0</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getText() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.apache.commons.text");
        }

        /**
         * Dependency provider for <b>validator</b> with <b>commons-validator:commons-validator</b> coordinates and
         * with version reference <b>org.apache.commons.validator</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getValidator() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.apache.commons.validator");
        }

        /**
         * Group of libraries at <b>org.apache.commons.commons</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgApacheCommonsCommonsLibraryAccessors getCommons() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgApacheCommonsCommonsLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgApacheCommonsCommonsLibraryAccessors extends SubDependencyFactory {

        public OrgApacheCommonsCommonsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>compress</b> with <b>org.apache.commons:commons-compress</b> coordinates and
         * with version reference <b>org.apache.commons.commons.compress</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCompress() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.apache.commons.commons.compress");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgApacheHttpcomponentsLibraryAccessors extends SubDependencyFactory {
        private final OrgApacheHttpcomponentsClient5LibraryAccessors laccForOrgApacheHttpcomponentsClient5LibraryAccessors = new OrgApacheHttpcomponentsClient5LibraryAccessors(owner);

        public OrgApacheHttpcomponentsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>httpclient</b> with <b>org.apache.httpcomponents:httpclient</b> coordinates and
         * with version reference <b>org.apache.httpcomponents.httpclient</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getHttpclient() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.apache.httpcomponents.httpclient");
        }

        /**
         * Dependency provider for <b>httpcore</b> with <b>org.apache.httpcomponents:httpcore</b> coordinates and
         * with version reference <b>org.apache.httpcomponents.httpcore</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getHttpcore() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.apache.httpcomponents.httpcore");
        }

        /**
         * Dependency provider for <b>httpmime</b> with <b>org.apache.httpcomponents:httpmime</b> coordinates and
         * with version reference <b>org.apache.httpcomponents.httpmime</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getHttpmime() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.apache.httpcomponents.httpmime");
        }

        /**
         * Group of libraries at <b>org.apache.httpcomponents.client5</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgApacheHttpcomponentsClient5LibraryAccessors getClient5() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgApacheHttpcomponentsClient5LibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgApacheHttpcomponentsClient5LibraryAccessors extends SubDependencyFactory {
        private final OrgApacheHttpcomponentsClient5Httpclient5LibraryAccessors laccForOrgApacheHttpcomponentsClient5Httpclient5LibraryAccessors = new OrgApacheHttpcomponentsClient5Httpclient5LibraryAccessors(owner);

        public OrgApacheHttpcomponentsClient5LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.apache.httpcomponents.client5.httpclient5</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgApacheHttpcomponentsClient5Httpclient5LibraryAccessors getHttpclient5() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgApacheHttpcomponentsClient5Httpclient5LibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgApacheHttpcomponentsClient5Httpclient5LibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public OrgApacheHttpcomponentsClient5Httpclient5LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>httpclient5</b> with <b>org.apache.httpcomponents.client5:httpclient5</b> coordinates and
         * with version reference <b>org.apache.httpcomponents.client5.httpclient5</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> asProvider() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.apache.httpcomponents.client5.httpclient5");
        }

        /**
         * Dependency provider for <b>test</b> with <b>org.apache.httpcomponents.client5:httpclient5</b> coordinates and
         * with version reference <b>org.apache.httpcomponents.client5.httpclient5.test</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getTest() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.apache.httpcomponents.client5.httpclient5.test");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgApacheKafkaLibraryAccessors extends SubDependencyFactory {
        private final OrgApacheKafkaKafkaLibraryAccessors laccForOrgApacheKafkaKafkaLibraryAccessors = new OrgApacheKafkaKafkaLibraryAccessors(owner);

        public OrgApacheKafkaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.apache.kafka.kafka</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgApacheKafkaKafkaLibraryAccessors getKafka() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgApacheKafkaKafkaLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgApacheKafkaKafkaLibraryAccessors extends SubDependencyFactory {

        public OrgApacheKafkaKafkaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>clients</b> with <b>org.apache.kafka:kafka-clients</b> coordinates and
         * with version reference <b>org.apache.kafka.kafka.clients</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getClients() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.apache.kafka.kafka.clients");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgApachePoiLibraryAccessors extends SubDependencyFactory {
        private final OrgApachePoiPoiLibraryAccessors laccForOrgApachePoiPoiLibraryAccessors = new OrgApachePoiPoiLibraryAccessors(owner);

        public OrgApachePoiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.apache.poi.poi</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgApachePoiPoiLibraryAccessors getPoi() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgApachePoiPoiLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgApachePoiPoiLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public OrgApachePoiPoiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>poi</b> with <b>org.apache.poi:poi</b> coordinates and
         * with version reference <b>org.apache.poi.poi</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> asProvider() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.apache.poi.poi");
        }

        /**
         * Dependency provider for <b>ooxml</b> with <b>org.apache.poi:poi-ooxml</b> coordinates and
         * with version reference <b>org.apache.poi.poi.ooxml</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getOoxml() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.apache.poi.poi.ooxml");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgAspectjLibraryAccessors extends SubDependencyFactory {

        public OrgAspectjLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>aspectjrt</b> with <b>org.aspectj:aspectjrt</b> coordinates and
         * with version reference <b>org.aspectj.aspectjrt</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getAspectjrt() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.aspectj.aspectjrt");
        }

        /**
         * Dependency provider for <b>aspectjweaver</b> with <b>org.aspectj:aspectjweaver</b> coordinates and
         * with version reference <b>org.aspectj.aspectjweaver</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getAspectjweaver() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.aspectj.aspectjweaver");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgAssertjLibraryAccessors extends SubDependencyFactory {
        private final OrgAssertjAssertjLibraryAccessors laccForOrgAssertjAssertjLibraryAccessors = new OrgAssertjAssertjLibraryAccessors(owner);

        public OrgAssertjLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.assertj.assertj</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgAssertjAssertjLibraryAccessors getAssertj() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgAssertjAssertjLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgAssertjAssertjLibraryAccessors extends SubDependencyFactory {

        public OrgAssertjAssertjLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>org.assertj:assertj-core</b> coordinates and
         * with version reference <b>org.assertj.assertj.core</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCore() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.assertj.assertj.core");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgAsynchttpclientLibraryAccessors extends SubDependencyFactory {
        private final OrgAsynchttpclientAsyncLibraryAccessors laccForOrgAsynchttpclientAsyncLibraryAccessors = new OrgAsynchttpclientAsyncLibraryAccessors(owner);

        public OrgAsynchttpclientLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.asynchttpclient.async</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgAsynchttpclientAsyncLibraryAccessors getAsync() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgAsynchttpclientAsyncLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgAsynchttpclientAsyncLibraryAccessors extends SubDependencyFactory {
        private final OrgAsynchttpclientAsyncHttpLibraryAccessors laccForOrgAsynchttpclientAsyncHttpLibraryAccessors = new OrgAsynchttpclientAsyncHttpLibraryAccessors(owner);

        public OrgAsynchttpclientAsyncLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.asynchttpclient.async.http</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgAsynchttpclientAsyncHttpLibraryAccessors getHttp() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgAsynchttpclientAsyncHttpLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgAsynchttpclientAsyncHttpLibraryAccessors extends SubDependencyFactory {

        public OrgAsynchttpclientAsyncHttpLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>client</b> with <b>org.asynchttpclient:async-http-client</b> coordinates and
         * with version reference <b>org.asynchttpclient.async.http.client</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getClient() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.asynchttpclient.async.http.client");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgAwaitilityLibraryAccessors extends SubDependencyFactory {
        private final OrgAwaitilityAwaitilityLibraryAccessors laccForOrgAwaitilityAwaitilityLibraryAccessors = new OrgAwaitilityAwaitilityLibraryAccessors(owner);

        public OrgAwaitilityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.awaitility.awaitility</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgAwaitilityAwaitilityLibraryAccessors getAwaitility() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgAwaitilityAwaitilityLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgAwaitilityAwaitilityLibraryAccessors extends SubDependencyFactory {

        public OrgAwaitilityAwaitilityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>kotlin</b> with <b>org.awaitility:awaitility-kotlin</b> coordinates and
         * with version reference <b>org.awaitility.awaitility.kotlin</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getKotlin() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.awaitility.awaitility.kotlin");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgHamcrestLibraryAccessors extends SubDependencyFactory {

        public OrgHamcrestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>hamcrest</b> with <b>org.hamcrest:hamcrest</b> coordinates and
         * with version reference <b>org.hamcrest.hamcrest</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getHamcrest() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.hamcrest.hamcrest");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgJetbrainsLibraryAccessors extends SubDependencyFactory {
        private final OrgJetbrainsKotlinLibraryAccessors laccForOrgJetbrainsKotlinLibraryAccessors = new OrgJetbrainsKotlinLibraryAccessors(owner);
        private final OrgJetbrainsKotlinxLibraryAccessors laccForOrgJetbrainsKotlinxLibraryAccessors = new OrgJetbrainsKotlinxLibraryAccessors(owner);

        public OrgJetbrainsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.jetbrains.kotlin</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgJetbrainsKotlinLibraryAccessors getKotlin() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgJetbrainsKotlinLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.jetbrains.kotlinx</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgJetbrainsKotlinxLibraryAccessors getKotlinx() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgJetbrainsKotlinxLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgJetbrainsKotlinLibraryAccessors extends SubDependencyFactory {
        private final OrgJetbrainsKotlinKotlinLibraryAccessors laccForOrgJetbrainsKotlinKotlinLibraryAccessors = new OrgJetbrainsKotlinKotlinLibraryAccessors(owner);

        public OrgJetbrainsKotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.jetbrains.kotlin.kotlin</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgJetbrainsKotlinKotlinLibraryAccessors getKotlin() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgJetbrainsKotlinKotlinLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgJetbrainsKotlinKotlinLibraryAccessors extends SubDependencyFactory {
        private final OrgJetbrainsKotlinKotlinTestLibraryAccessors laccForOrgJetbrainsKotlinKotlinTestLibraryAccessors = new OrgJetbrainsKotlinKotlinTestLibraryAccessors(owner);

        public OrgJetbrainsKotlinKotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>reflect</b> with <b>org.jetbrains.kotlin:kotlin-reflect</b> coordinates and
         * with version reference <b>kotlin.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getReflect() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.jetbrains.kotlin.kotlin.reflect");
        }

        /**
         * Dependency provider for <b>stdlib</b> with <b>org.jetbrains.kotlin:kotlin-stdlib</b> coordinates and
         * with version reference <b>kotlin.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getStdlib() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.jetbrains.kotlin.kotlin.stdlib");
        }

        /**
         * Group of libraries at <b>org.jetbrains.kotlin.kotlin.test</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgJetbrainsKotlinKotlinTestLibraryAccessors getTest() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgJetbrainsKotlinKotlinTestLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgJetbrainsKotlinKotlinTestLibraryAccessors extends SubDependencyFactory {

        public OrgJetbrainsKotlinKotlinTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>junit5</b> with <b>org.jetbrains.kotlin:kotlin-test-junit5</b> coordinates and
         * with version reference <b>kotlin.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJunit5() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.jetbrains.kotlin.kotlin.test.junit5");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgJetbrainsKotlinxLibraryAccessors extends SubDependencyFactory {
        private final OrgJetbrainsKotlinxKotlinxLibraryAccessors laccForOrgJetbrainsKotlinxKotlinxLibraryAccessors = new OrgJetbrainsKotlinxKotlinxLibraryAccessors(owner);

        public OrgJetbrainsKotlinxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.jetbrains.kotlinx.kotlinx</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgJetbrainsKotlinxKotlinxLibraryAccessors getKotlinx() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgJetbrainsKotlinxKotlinxLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgJetbrainsKotlinxKotlinxLibraryAccessors extends SubDependencyFactory {
        private final OrgJetbrainsKotlinxKotlinxCoroutinesLibraryAccessors laccForOrgJetbrainsKotlinxKotlinxCoroutinesLibraryAccessors = new OrgJetbrainsKotlinxKotlinxCoroutinesLibraryAccessors(owner);

        public OrgJetbrainsKotlinxKotlinxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>datetime</b> with <b>org.jetbrains.kotlinx:kotlinx-datetime</b> coordinates and
         * with version reference <b>org.jetbrains.kotlinx.kotlinx.datetime</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getDatetime() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.jetbrains.kotlinx.kotlinx.datetime");
        }

        /**
         * Group of libraries at <b>org.jetbrains.kotlinx.kotlinx.coroutines</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgJetbrainsKotlinxKotlinxCoroutinesLibraryAccessors getCoroutines() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgJetbrainsKotlinxKotlinxCoroutinesLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgJetbrainsKotlinxKotlinxCoroutinesLibraryAccessors extends SubDependencyFactory {
        private final OrgJetbrainsKotlinxKotlinxCoroutinesCoreLibraryAccessors laccForOrgJetbrainsKotlinxKotlinxCoroutinesCoreLibraryAccessors = new OrgJetbrainsKotlinxKotlinxCoroutinesCoreLibraryAccessors(owner);

        public OrgJetbrainsKotlinxKotlinxCoroutinesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jdk8</b> with <b>org.jetbrains.kotlinx:kotlinx-coroutines-jdk8</b> coordinates and
         * with version reference <b>org.jetbrains.kotlinx.coroutines</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJdk8() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.jetbrains.kotlinx.kotlinx.coroutines.jdk8");
        }

        /**
         * Dependency provider for <b>reactor</b> with <b>org.jetbrains.kotlinx:kotlinx-coroutines-reactor</b> coordinates and
         * with version reference <b>org.jetbrains.kotlinx.coroutines</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getReactor() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.jetbrains.kotlinx.kotlinx.coroutines.reactor");
        }

        /**
         * Dependency provider for <b>test</b> with <b>org.jetbrains.kotlinx:kotlinx-coroutines-test</b> coordinates and
         * with version reference <b>org.jetbrains.kotlinx.coroutines</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getTest() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.jetbrains.kotlinx.kotlinx.coroutines.test");
        }

        /**
         * Group of libraries at <b>org.jetbrains.kotlinx.kotlinx.coroutines.core</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgJetbrainsKotlinxKotlinxCoroutinesCoreLibraryAccessors getCore() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgJetbrainsKotlinxKotlinxCoroutinesCoreLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgJetbrainsKotlinxKotlinxCoroutinesCoreLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public OrgJetbrainsKotlinxKotlinxCoroutinesCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>org.jetbrains.kotlinx:kotlinx-coroutines-core</b> coordinates and
         * with version reference <b>org.jetbrains.kotlinx.coroutines</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> asProvider() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.jetbrains.kotlinx.kotlinx.coroutines.core");
        }

        /**
         * Dependency provider for <b>jvm</b> with <b>org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm</b> coordinates and
         * with version reference <b>org.jetbrains.kotlinx.coroutines</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJvm() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.jetbrains.kotlinx.kotlinx.coroutines.core.jvm");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgJunitLibraryAccessors extends SubDependencyFactory {
        private final OrgJunitJupiterLibraryAccessors laccForOrgJunitJupiterLibraryAccessors = new OrgJunitJupiterLibraryAccessors(owner);
        private final OrgJunitPlatformLibraryAccessors laccForOrgJunitPlatformLibraryAccessors = new OrgJunitPlatformLibraryAccessors(owner);

        public OrgJunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.junit.jupiter</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgJunitJupiterLibraryAccessors getJupiter() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgJunitJupiterLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.junit.platform</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgJunitPlatformLibraryAccessors getPlatform() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgJunitPlatformLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgJunitJupiterLibraryAccessors extends SubDependencyFactory {
        private final OrgJunitJupiterJunitLibraryAccessors laccForOrgJunitJupiterJunitLibraryAccessors = new OrgJunitJupiterJunitLibraryAccessors(owner);

        public OrgJunitJupiterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.junit.jupiter.junit</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgJunitJupiterJunitLibraryAccessors getJunit() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgJunitJupiterJunitLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgJunitJupiterJunitLibraryAccessors extends SubDependencyFactory {
        private final OrgJunitJupiterJunitJupiterLibraryAccessors laccForOrgJunitJupiterJunitJupiterLibraryAccessors = new OrgJunitJupiterJunitJupiterLibraryAccessors(owner);

        public OrgJunitJupiterJunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.junit.jupiter.junit.jupiter</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgJunitJupiterJunitJupiterLibraryAccessors getJupiter() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgJunitJupiterJunitJupiterLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgJunitJupiterJunitJupiterLibraryAccessors extends SubDependencyFactory {

        public OrgJunitJupiterJunitJupiterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>api</b> with <b>org.junit.jupiter:junit-jupiter-api</b> coordinates and
         * with version reference <b>junit.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getApi() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.junit.jupiter.junit.jupiter.api");
        }

        /**
         * Dependency provider for <b>engine</b> with <b>org.junit.jupiter:junit-jupiter-engine</b> coordinates and
         * with version reference <b>org.junit.jupiter.junit.jupiter.engine</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getEngine() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.junit.jupiter.junit.jupiter.engine");
        }

        /**
         * Dependency provider for <b>params</b> with <b>org.junit.jupiter:junit-jupiter-params</b> coordinates and
         * with version reference <b>junit.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getParams() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.junit.jupiter.junit.jupiter.params");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgJunitPlatformLibraryAccessors extends SubDependencyFactory {
        private final OrgJunitPlatformJunitLibraryAccessors laccForOrgJunitPlatformJunitLibraryAccessors = new OrgJunitPlatformJunitLibraryAccessors(owner);

        public OrgJunitPlatformLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.junit.platform.junit</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgJunitPlatformJunitLibraryAccessors getJunit() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgJunitPlatformJunitLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgJunitPlatformJunitLibraryAccessors extends SubDependencyFactory {
        private final OrgJunitPlatformJunitPlatformLibraryAccessors laccForOrgJunitPlatformJunitPlatformLibraryAccessors = new OrgJunitPlatformJunitPlatformLibraryAccessors(owner);

        public OrgJunitPlatformJunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.junit.platform.junit.platform</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgJunitPlatformJunitPlatformLibraryAccessors getPlatform() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgJunitPlatformJunitPlatformLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgJunitPlatformJunitPlatformLibraryAccessors extends SubDependencyFactory {

        public OrgJunitPlatformJunitPlatformLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>launcher</b> with <b>org.junit.platform:junit-platform-launcher</b> coordinates and
         * with version reference <b>org.junit.platform.junit.platform.launcher</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getLauncher() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.junit.platform.junit.platform.launcher");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgLiquibaseLibraryAccessors extends SubDependencyFactory {
        private final OrgLiquibaseLiquibaseLibraryAccessors laccForOrgLiquibaseLiquibaseLibraryAccessors = new OrgLiquibaseLiquibaseLibraryAccessors(owner);

        public OrgLiquibaseLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.liquibase.liquibase</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgLiquibaseLiquibaseLibraryAccessors getLiquibase() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgLiquibaseLiquibaseLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgLiquibaseLiquibaseLibraryAccessors extends SubDependencyFactory {

        public OrgLiquibaseLiquibaseLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>org.liquibase:liquibase-core</b> coordinates and
         * with version reference <b>org.liquibase.liquibase.core</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCore() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.liquibase.liquibase.core");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgLz4LibraryAccessors extends SubDependencyFactory {
        private final OrgLz4Lz4LibraryAccessors laccForOrgLz4Lz4LibraryAccessors = new OrgLz4Lz4LibraryAccessors(owner);

        public OrgLz4LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.lz4.lz4</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgLz4Lz4LibraryAccessors getLz4() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgLz4Lz4LibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgLz4Lz4LibraryAccessors extends SubDependencyFactory {

        public OrgLz4Lz4LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>java</b> with <b>org.lz4:lz4-java</b> coordinates and
         * with version reference <b>org.lz4.java</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJava() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.lz4.lz4.java");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgMockLibraryAccessors extends SubDependencyFactory {
        private final OrgMockServerLibraryAccessors laccForOrgMockServerLibraryAccessors = new OrgMockServerLibraryAccessors(owner);

        public OrgMockLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.mock.server</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgMockServerLibraryAccessors getServer() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgMockServerLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgMockServerLibraryAccessors extends SubDependencyFactory {
        private final OrgMockServerMockserverLibraryAccessors laccForOrgMockServerMockserverLibraryAccessors = new OrgMockServerMockserverLibraryAccessors(owner);

        public OrgMockServerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.mock.server.mockserver</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgMockServerMockserverLibraryAccessors getMockserver() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgMockServerMockserverLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgMockServerMockserverLibraryAccessors extends SubDependencyFactory {

        public OrgMockServerMockserverLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>org.mock-server:mockserver-core</b> coordinates and
         * with version reference <b>org.mock.server.mockserver.netty</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCore() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.mock.server.mockserver.core");
        }

        /**
         * Dependency provider for <b>netty</b> with <b>org.mock-server:mockserver-netty</b> coordinates and
         * with version reference <b>org.mock.server.mockserver.netty</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getNetty() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.mock.server.mockserver.netty");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgMockitoLibraryAccessors extends SubDependencyFactory {
        private final OrgMockitoKotlinLibraryAccessors laccForOrgMockitoKotlinLibraryAccessors = new OrgMockitoKotlinLibraryAccessors(owner);
        private final OrgMockitoMockitoLibraryAccessors laccForOrgMockitoMockitoLibraryAccessors = new OrgMockitoMockitoLibraryAccessors(owner);

        public OrgMockitoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.mockito.kotlin</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgMockitoKotlinLibraryAccessors getKotlin() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgMockitoKotlinLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.mockito.mockito</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgMockitoMockitoLibraryAccessors getMockito() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgMockitoMockitoLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgMockitoKotlinLibraryAccessors extends SubDependencyFactory {
        private final OrgMockitoKotlinMockitoLibraryAccessors laccForOrgMockitoKotlinMockitoLibraryAccessors = new OrgMockitoKotlinMockitoLibraryAccessors(owner);

        public OrgMockitoKotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.mockito.kotlin.mockito</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgMockitoKotlinMockitoLibraryAccessors getMockito() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgMockitoKotlinMockitoLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgMockitoKotlinMockitoLibraryAccessors extends SubDependencyFactory {

        public OrgMockitoKotlinMockitoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>kotlin</b> with <b>org.mockito.kotlin:mockito-kotlin</b> coordinates and
         * with version reference <b>org.mockito.kotlin.mockito.kotlin</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getKotlin() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.mockito.kotlin.mockito.kotlin");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgMockitoMockitoLibraryAccessors extends SubDependencyFactory {
        private final OrgMockitoMockitoJunitLibraryAccessors laccForOrgMockitoMockitoJunitLibraryAccessors = new OrgMockitoMockitoJunitLibraryAccessors(owner);

        public OrgMockitoMockitoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>org.mockito:mockito-core</b> coordinates and
         * with version reference <b>mockito.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCore() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.mockito.mockito.core");
        }

        /**
         * Dependency provider for <b>inline</b> with <b>org.mockito:mockito-inline</b> coordinates and
         * with version reference <b>org.mockito.mockito.inline</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getInline() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.mockito.mockito.inline");
        }

        /**
         * Group of libraries at <b>org.mockito.mockito.junit</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgMockitoMockitoJunitLibraryAccessors getJunit() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgMockitoMockitoJunitLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgMockitoMockitoJunitLibraryAccessors extends SubDependencyFactory {

        public OrgMockitoMockitoJunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jupiter</b> with <b>org.mockito:mockito-junit-jupiter</b> coordinates and
         * with version reference <b>mockito.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJupiter() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.mockito.mockito.junit.jupiter");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgPostgresqlLibraryAccessors extends SubDependencyFactory {

        public OrgPostgresqlLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>postgresql</b> with <b>org.postgresql:postgresql</b> coordinates and
         * with version reference <b>org.postgresql.postgresql</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getPostgresql() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.postgresql.postgresql");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringdocLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringdocSpringdocLibraryAccessors laccForOrgSpringdocSpringdocLibraryAccessors = new OrgSpringdocSpringdocLibraryAccessors(owner);

        public OrgSpringdocLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.springdoc.springdoc</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringdocSpringdocLibraryAccessors getSpringdoc() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringdocSpringdocLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringdocSpringdocLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringdocSpringdocOpenapiLibraryAccessors laccForOrgSpringdocSpringdocOpenapiLibraryAccessors = new OrgSpringdocSpringdocOpenapiLibraryAccessors(owner);

        public OrgSpringdocSpringdocLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.springdoc.springdoc.openapi</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringdocSpringdocOpenapiLibraryAccessors getOpenapi() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringdocSpringdocOpenapiLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringdocSpringdocOpenapiLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringdocSpringdocOpenapiStarterLibraryAccessors laccForOrgSpringdocSpringdocOpenapiStarterLibraryAccessors = new OrgSpringdocSpringdocOpenapiStarterLibraryAccessors(owner);

        public OrgSpringdocSpringdocOpenapiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.springdoc.springdoc.openapi.starter</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringdocSpringdocOpenapiStarterLibraryAccessors getStarter() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringdocSpringdocOpenapiStarterLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringdocSpringdocOpenapiStarterLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringdocSpringdocOpenapiStarterWebLibraryAccessors laccForOrgSpringdocSpringdocOpenapiStarterWebLibraryAccessors = new OrgSpringdocSpringdocOpenapiStarterWebLibraryAccessors(owner);
        private final OrgSpringdocSpringdocOpenapiStarterWebfluxLibraryAccessors laccForOrgSpringdocSpringdocOpenapiStarterWebfluxLibraryAccessors = new OrgSpringdocSpringdocOpenapiStarterWebfluxLibraryAccessors(owner);

        public OrgSpringdocSpringdocOpenapiStarterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.springdoc.springdoc.openapi.starter.web</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringdocSpringdocOpenapiStarterWebLibraryAccessors getWeb() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringdocSpringdocOpenapiStarterWebLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.springdoc.springdoc.openapi.starter.webflux</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringdocSpringdocOpenapiStarterWebfluxLibraryAccessors getWebflux() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringdocSpringdocOpenapiStarterWebfluxLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringdocSpringdocOpenapiStarterWebLibraryAccessors extends SubDependencyFactory {

        public OrgSpringdocSpringdocOpenapiStarterWebLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>ui</b> with <b>org.springdoc:springdoc-openapi-starter-webmvc-ui</b> coordinates and
         * with version reference <b>org.springdoc.springdoc.openapi.starter.ui</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getUi() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.springdoc.springdoc.openapi.starter.web.ui");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringdocSpringdocOpenapiStarterWebfluxLibraryAccessors extends SubDependencyFactory {

        public OrgSpringdocSpringdocOpenapiStarterWebfluxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>ui</b> with <b>org.springdoc:springdoc-openapi-starter-webflux-ui</b> coordinates and
         * with version reference <b>org.springdoc.springdoc.openapi.starter.ui</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getUi() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.springdoc.springdoc.openapi.starter.webflux.ui");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
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
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJdbc() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.springframework.jdbc");
        }

        /**
         * Group of libraries at <b>org.springframework.boot</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringframeworkBootLibraryAccessors getBoot() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringframeworkBootLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.springframework.data</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringframeworkDataLibraryAccessors getData() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringframeworkDataLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.springframework.kafka</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringframeworkKafkaLibraryAccessors getKafka() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringframeworkKafkaLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.springframework.spring</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringframeworkSpringLibraryAccessors getSpring() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringframeworkSpringLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringframeworkBootLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkBootSpringLibraryAccessors laccForOrgSpringframeworkBootSpringLibraryAccessors = new OrgSpringframeworkBootSpringLibraryAccessors(owner);

        public OrgSpringframeworkBootLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>bom</b> with <b>org.springframework.boot:spring-boot-dependencies</b> coordinates and
         * with version reference <b>spring.boot.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getBom() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.springframework.boot.bom");
        }

        /**
         * Group of libraries at <b>org.springframework.boot.spring</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringframeworkBootSpringLibraryAccessors getSpring() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringframeworkBootSpringLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringframeworkBootSpringLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkBootSpringBootLibraryAccessors laccForOrgSpringframeworkBootSpringBootLibraryAccessors = new OrgSpringframeworkBootSpringBootLibraryAccessors(owner);

        public OrgSpringframeworkBootSpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.springframework.boot.spring.boot</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringframeworkBootSpringBootLibraryAccessors getBoot() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringframeworkBootSpringBootLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringframeworkBootSpringBootLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final OrgSpringframeworkBootSpringBootStarterLibraryAccessors laccForOrgSpringframeworkBootSpringBootStarterLibraryAccessors = new OrgSpringframeworkBootSpringBootStarterLibraryAccessors(owner);

        public OrgSpringframeworkBootSpringBootLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>boot</b> with <b>org.springframework.boot:spring-boot</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> asProvider() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.springframework.boot.spring.boot");
        }

        /**
         * Dependency provider for <b>autoconfigure</b> with <b>org.springframework.boot:spring-boot-autoconfigure</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getAutoconfigure() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.springframework.boot.spring.boot.autoconfigure");
        }

        /**
         * Group of libraries at <b>org.springframework.boot.spring.boot.starter</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringframeworkBootSpringBootStarterLibraryAccessors getStarter() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringframeworkBootSpringBootStarterLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringframeworkBootSpringBootStarterLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final OrgSpringframeworkBootSpringBootStarterDataLibraryAccessors laccForOrgSpringframeworkBootSpringBootStarterDataLibraryAccessors = new OrgSpringframeworkBootSpringBootStarterDataLibraryAccessors(owner);

        public OrgSpringframeworkBootSpringBootStarterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>starter</b> with <b>org.springframework.boot:spring-boot-starter</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> asProvider() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.springframework.boot.spring.boot.starter");
        }

        /**
         * Dependency provider for <b>actuator</b> with <b>org.springframework.boot:spring-boot-starter-actuator</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getActuator() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.springframework.boot.spring.boot.starter.actuator");
        }

        /**
         * Dependency provider for <b>aop</b> with <b>org.springframework.boot:spring-boot-starter-aop</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getAop() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.springframework.boot.spring.boot.starter.aop");
        }

        /**
         * Dependency provider for <b>cache</b> with <b>org.springframework.boot:spring-boot-starter-cache</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCache() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.springframework.boot.spring.boot.starter.cache");
        }

        /**
         * Dependency provider for <b>json</b> with <b>org.springframework.boot:spring-boot-starter-json</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJson() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.springframework.boot.spring.boot.starter.json");
        }

        /**
         * Dependency provider for <b>test</b> with <b>org.springframework.boot:spring-boot-starter-test</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getTest() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.springframework.boot.spring.boot.starter.test");
        }

        /**
         * Dependency provider for <b>validation</b> with <b>org.springframework.boot:spring-boot-starter-validation</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getValidation() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.springframework.boot.spring.boot.starter.validation");
        }

        /**
         * Dependency provider for <b>web</b> with <b>org.springframework.boot:spring-boot-starter-web</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getWeb() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.springframework.boot.spring.boot.starter.web");
        }

        /**
         * Dependency provider for <b>webflux</b> with <b>org.springframework.boot:spring-boot-starter-webflux</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getWebflux() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.springframework.boot.spring.boot.starter.webflux");
        }

        /**
         * Group of libraries at <b>org.springframework.boot.spring.boot.starter.data</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringframeworkBootSpringBootStarterDataLibraryAccessors getData() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringframeworkBootSpringBootStarterDataLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringframeworkBootSpringBootStarterDataLibraryAccessors extends SubDependencyFactory {

        public OrgSpringframeworkBootSpringBootStarterDataLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jdbc</b> with <b>org.springframework.boot:spring-boot-starter-data-jdbc</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJdbc() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.springframework.boot.spring.boot.starter.data.jdbc");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringframeworkDataLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkDataSpringLibraryAccessors laccForOrgSpringframeworkDataSpringLibraryAccessors = new OrgSpringframeworkDataSpringLibraryAccessors(owner);

        public OrgSpringframeworkDataLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.springframework.data.spring</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringframeworkDataSpringLibraryAccessors getSpring() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringframeworkDataSpringLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringframeworkDataSpringLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkDataSpringDataLibraryAccessors laccForOrgSpringframeworkDataSpringDataLibraryAccessors = new OrgSpringframeworkDataSpringDataLibraryAccessors(owner);

        public OrgSpringframeworkDataSpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.springframework.data.spring.data</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringframeworkDataSpringDataLibraryAccessors getData() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringframeworkDataSpringDataLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringframeworkDataSpringDataLibraryAccessors extends SubDependencyFactory {

        public OrgSpringframeworkDataSpringDataLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>commons</b> with <b>org.springframework.data:spring-data-commons</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCommons() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.springframework.data.spring.data.commons");
        }

        /**
         * Dependency provider for <b>relational</b> with <b>org.springframework.data:spring-data-relational</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getRelational() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.springframework.data.spring.data.relational");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringframeworkKafkaLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkKafkaSpringLibraryAccessors laccForOrgSpringframeworkKafkaSpringLibraryAccessors = new OrgSpringframeworkKafkaSpringLibraryAccessors(owner);

        public OrgSpringframeworkKafkaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.springframework.kafka.spring</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringframeworkKafkaSpringLibraryAccessors getSpring() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringframeworkKafkaSpringLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringframeworkKafkaSpringLibraryAccessors extends SubDependencyFactory {

        public OrgSpringframeworkKafkaSpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>kafka</b> with <b>org.springframework.kafka:spring-kafka</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getKafka() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.springframework.kafka.spring.kafka");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringframeworkSpringLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkSpringContextLibraryAccessors laccForOrgSpringframeworkSpringContextLibraryAccessors = new OrgSpringframeworkSpringContextLibraryAccessors(owner);

        public OrgSpringframeworkSpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>org.springframework:spring-core</b> coordinates and
         * with version reference <b>spring.framework.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCore() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.springframework.spring.core");
        }

        /**
         * Dependency provider for <b>retry</b> with <b>org.springframework.retry:spring-retry</b> coordinates and
         * with version reference <b>spring.retry.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getRetry() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.springframework.spring.retry");
        }

        /**
         * Dependency provider for <b>tx</b> with <b>org.springframework:spring-tx</b> coordinates and
         * with version reference <b>spring.framework.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getTx() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.springframework.spring.tx");
        }

        /**
         * Dependency provider for <b>web</b> with <b>org.springframework:spring-web</b> coordinates and
         * with version reference <b>spring.framework.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getWeb() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.springframework.spring.web");
        }

        /**
         * Group of libraries at <b>org.springframework.spring.context</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringframeworkSpringContextLibraryAccessors getContext() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringframeworkSpringContextLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringframeworkSpringContextLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public OrgSpringframeworkSpringContextLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>context</b> with <b>org.springframework:spring-context</b> coordinates and
         * with version reference <b>spring.framework.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> asProvider() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.springframework.spring.context");
        }

        /**
         * Dependency provider for <b>support</b> with <b>org.springframework:spring-context-support</b> coordinates and
         * with version reference <b>spring.framework.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getSupport() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.springframework.spring.context.support");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgTestcontainersLibraryAccessors extends SubDependencyFactory {
        private final OrgTestcontainersJunitLibraryAccessors laccForOrgTestcontainersJunitLibraryAccessors = new OrgTestcontainersJunitLibraryAccessors(owner);

        public OrgTestcontainersLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>cassandra</b> with <b>org.testcontainers:cassandra</b> coordinates and
         * with version reference <b>org.testcontainers</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCassandra() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.testcontainers.cassandra");
        }

        /**
         * Dependency provider for <b>clickhouse</b> with <b>org.testcontainers:clickhouse</b> coordinates and
         * with version reference <b>org.testcontainers</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getClickhouse() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.testcontainers.clickhouse");
        }

        /**
         * Dependency provider for <b>jdbc</b> with <b>org.testcontainers:jdbc</b> coordinates and
         * with version reference <b>org.testcontainers</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJdbc() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.testcontainers.jdbc");
        }

        /**
         * Dependency provider for <b>kafka</b> with <b>org.testcontainers:kafka</b> coordinates and
         * with version reference <b>org.testcontainers</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getKafka() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.testcontainers.kafka");
        }

        /**
         * Dependency provider for <b>minio</b> with <b>org.testcontainers:minio</b> coordinates and
         * with version reference <b>org.testcontainers</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getMinio() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.testcontainers.minio");
        }

        /**
         * Dependency provider for <b>mockserver</b> with <b>org.testcontainers:mockserver</b> coordinates and
         * with version reference <b>org.testcontainers</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getMockserver() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.testcontainers.mockserver");
        }

        /**
         * Dependency provider for <b>postgresql</b> with <b>org.testcontainers:postgresql</b> coordinates and
         * with version reference <b>org.testcontainers</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getPostgresql() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.testcontainers.postgresql");
        }

        /**
         * Dependency provider for <b>testcontainers</b> with <b>org.testcontainers:testcontainers</b> coordinates and
         * with version reference <b>org.testcontainers</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getTestcontainers() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.testcontainers.testcontainers");
        }

        /**
         * Group of libraries at <b>org.testcontainers.junit</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgTestcontainersJunitLibraryAccessors getJunit() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgTestcontainersJunitLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgTestcontainersJunitLibraryAccessors extends SubDependencyFactory {

        public OrgTestcontainersJunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jupiter</b> with <b>org.testcontainers:junit-jupiter</b> coordinates and
         * with version reference <b>org.testcontainers</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJupiter() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.testcontainers.junit.jupiter");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class S3LibraryAccessors extends SubDependencyFactory {
        private final S3AwsLibraryAccessors laccForS3AwsLibraryAccessors = new S3AwsLibraryAccessors(owner);

        public S3LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>s3.aws</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public S3AwsLibraryAccessors getAws() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForS3AwsLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class S3AwsLibraryAccessors extends SubDependencyFactory {

        public S3AwsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>sdk</b> with <b>software.amazon.awssdk:s3</b> coordinates and
         * with version reference <b>aws.s3.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getSdk() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("s3.aws.sdk");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ShedlockLibraryAccessors extends SubDependencyFactory {
        private final ShedlockProviderLibraryAccessors laccForShedlockProviderLibraryAccessors = new ShedlockProviderLibraryAccessors(owner);

        public ShedlockLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>spring</b> with <b>net.javacrumbs.shedlock:shedlock-spring</b> coordinates and
         * with version reference <b>shedlock.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getSpring() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("shedlock.spring");
        }

        /**
         * Group of libraries at <b>shedlock.provider</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ShedlockProviderLibraryAccessors getProvider() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForShedlockProviderLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ShedlockProviderLibraryAccessors extends SubDependencyFactory {

        public ShedlockProviderLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jdbc</b> with <b>net.javacrumbs.shedlock:shedlock-provider-jdbc-template</b> coordinates and
         * with version reference <b>shedlock.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJdbc() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("shedlock.provider.jdbc");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class SoftwareLibraryAccessors extends SubDependencyFactory {
        private final SoftwareAmazonLibraryAccessors laccForSoftwareAmazonLibraryAccessors = new SoftwareAmazonLibraryAccessors(owner);

        public SoftwareLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>software.amazon</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public SoftwareAmazonLibraryAccessors getAmazon() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForSoftwareAmazonLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class SoftwareAmazonLibraryAccessors extends SubDependencyFactory {
        private final SoftwareAmazonAwssdkLibraryAccessors laccForSoftwareAmazonAwssdkLibraryAccessors = new SoftwareAmazonAwssdkLibraryAccessors(owner);

        public SoftwareAmazonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>software.amazon.awssdk</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public SoftwareAmazonAwssdkLibraryAccessors getAwssdk() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForSoftwareAmazonAwssdkLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class SoftwareAmazonAwssdkLibraryAccessors extends SubDependencyFactory {
        private final SoftwareAmazonAwssdkNettyLibraryAccessors laccForSoftwareAmazonAwssdkNettyLibraryAccessors = new SoftwareAmazonAwssdkNettyLibraryAccessors(owner);

        public SoftwareAmazonAwssdkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>s3</b> with <b>software.amazon.awssdk:s3</b> coordinates and
         * with version reference <b>amazon.awssdk.s3</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getS3() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("software.amazon.awssdk.s3");
        }

        /**
         * Group of libraries at <b>software.amazon.awssdk.netty</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public SoftwareAmazonAwssdkNettyLibraryAccessors getNetty() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForSoftwareAmazonAwssdkNettyLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class SoftwareAmazonAwssdkNettyLibraryAccessors extends SubDependencyFactory {
        private final SoftwareAmazonAwssdkNettyNioLibraryAccessors laccForSoftwareAmazonAwssdkNettyNioLibraryAccessors = new SoftwareAmazonAwssdkNettyNioLibraryAccessors(owner);

        public SoftwareAmazonAwssdkNettyLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>software.amazon.awssdk.netty.nio</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public SoftwareAmazonAwssdkNettyNioLibraryAccessors getNio() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForSoftwareAmazonAwssdkNettyNioLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class SoftwareAmazonAwssdkNettyNioLibraryAccessors extends SubDependencyFactory {

        public SoftwareAmazonAwssdkNettyNioLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>client</b> with <b>software.amazon.awssdk:netty-nio-client</b> coordinates and
         * with version reference <b>amazon.awssdk.s3</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getClient() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("software.amazon.awssdk.netty.nio.client");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
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
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getWebflux() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("spring.webflux");
        }

        /**
         * Group of libraries at <b>spring.boot</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public SpringBootLibraryAccessors getBoot() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForSpringBootLibraryAccessors;
        }

        /**
         * Group of libraries at <b>spring.cloud</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public SpringCloudLibraryAccessors getCloud() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForSpringCloudLibraryAccessors;
        }

        /**
         * Group of libraries at <b>spring.data</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public SpringDataLibraryAccessors getData() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForSpringDataLibraryAccessors;
        }

        /**
         * Group of libraries at <b>spring.openapi</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public SpringOpenapiLibraryAccessors getOpenapi() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForSpringOpenapiLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class SpringBootLibraryAccessors extends SubDependencyFactory {
        private final SpringBootConfigurationLibraryAccessors laccForSpringBootConfigurationLibraryAccessors = new SpringBootConfigurationLibraryAccessors(owner);
        private final SpringBootStarterLibraryAccessors laccForSpringBootStarterLibraryAccessors = new SpringBootStarterLibraryAccessors(owner);

        public SpringBootLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>spring.boot.configuration</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public SpringBootConfigurationLibraryAccessors getConfiguration() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForSpringBootConfigurationLibraryAccessors;
        }

        /**
         * Group of libraries at <b>spring.boot.starter</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public SpringBootStarterLibraryAccessors getStarter() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForSpringBootStarterLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class SpringBootConfigurationLibraryAccessors extends SubDependencyFactory {
        private final SpringBootConfigurationAnnotationLibraryAccessors laccForSpringBootConfigurationAnnotationLibraryAccessors = new SpringBootConfigurationAnnotationLibraryAccessors(owner);

        public SpringBootConfigurationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>spring.boot.configuration.annotation</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public SpringBootConfigurationAnnotationLibraryAccessors getAnnotation() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForSpringBootConfigurationAnnotationLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class SpringBootConfigurationAnnotationLibraryAccessors extends SubDependencyFactory {

        public SpringBootConfigurationAnnotationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>processor</b> with <b>org.springframework.boot:spring-boot-configuration-processor</b> coordinates and
         * with version reference <b>spring.boot.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getProcessor() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("spring.boot.configuration.annotation.processor");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class SpringBootStarterLibraryAccessors extends SubDependencyFactory {

        public SpringBootStarterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jdbc</b> with <b>org.springframework.boot:spring-boot-starter-jdbc</b> coordinates and
         * with version reference <b>spring.boot.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJdbc() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("spring.boot.starter.jdbc");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class SpringCloudLibraryAccessors extends SubDependencyFactory {
        private final SpringCloudContractLibraryAccessors laccForSpringCloudContractLibraryAccessors = new SpringCloudContractLibraryAccessors(owner);
        private final SpringCloudFeignLibraryAccessors laccForSpringCloudFeignLibraryAccessors = new SpringCloudFeignLibraryAccessors(owner);
        private final SpringCloudStarterLibraryAccessors laccForSpringCloudStarterLibraryAccessors = new SpringCloudStarterLibraryAccessors(owner);

        public SpringCloudLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>spring.cloud.contract</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public SpringCloudContractLibraryAccessors getContract() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForSpringCloudContractLibraryAccessors;
        }

        /**
         * Group of libraries at <b>spring.cloud.feign</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public SpringCloudFeignLibraryAccessors getFeign() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForSpringCloudFeignLibraryAccessors;
        }

        /**
         * Group of libraries at <b>spring.cloud.starter</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public SpringCloudStarterLibraryAccessors getStarter() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForSpringCloudStarterLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class SpringCloudContractLibraryAccessors extends SubDependencyFactory {

        public SpringCloudContractLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>wiremock</b> with <b>org.springframework.cloud:spring-cloud-contract-wiremock</b> coordinates and
         * with version reference <b>spring.cloud.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getWiremock() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("spring.cloud.contract.wiremock");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class SpringCloudFeignLibraryAccessors extends SubDependencyFactory {

        public SpringCloudFeignLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>okhttp</b> with <b>io.github.openfeign:feign-okhttp</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getOkhttp() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("spring.cloud.feign.okhttp");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class SpringCloudStarterLibraryAccessors extends SubDependencyFactory {

        public SpringCloudStarterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>gateway</b> with <b>org.springframework.cloud:spring-cloud-starter-gateway</b> coordinates and
         * with version reference <b>spring.cloud.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getGateway() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("spring.cloud.starter.gateway");
        }

        /**
         * Dependency provider for <b>loadbalancer</b> with <b>org.springframework.cloud:spring-cloud-starter-loadbalancer</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getLoadbalancer() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("spring.cloud.starter.loadbalancer");
        }

        /**
         * Dependency provider for <b>openfeign</b> with <b>org.springframework.cloud:spring-cloud-starter-openfeign</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getOpenfeign() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("spring.cloud.starter.openfeign");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class SpringDataLibraryAccessors extends SubDependencyFactory {
        private final SpringDataJpaLibraryAccessors laccForSpringDataJpaLibraryAccessors = new SpringDataJpaLibraryAccessors(owner);

        public SpringDataLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>spring.data.jpa</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public SpringDataJpaLibraryAccessors getJpa() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForSpringDataJpaLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class SpringDataJpaLibraryAccessors extends SubDependencyFactory {

        public SpringDataJpaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>starter</b> with <b>org.springframework.boot:spring-boot-starter-data-jpa</b> coordinates and
         * with version reference <b>spring.boot.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getStarter() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("spring.data.jpa.starter");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class SpringOpenapiLibraryAccessors extends SubDependencyFactory {

        public SpringOpenapiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>common</b> with <b>org.springdoc:springdoc-openapi-starter-common</b> coordinates and
         * with version reference <b>spring.doc.openapi.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCommon() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("spring.openapi.common");
        }

        /**
         * Dependency provider for <b>ui</b> with <b>org.springdoc:springdoc-openapi-starter-webmvc-ui</b> coordinates and
         * with version reference <b>spring.doc.openapi.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getUi() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("spring.openapi.ui");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class TestcontainersLibraryAccessors extends SubDependencyFactory {

        public TestcontainersLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>bom</b> with <b>org.testcontainers:testcontainers-bom</b> coordinates and
         * with version reference <b>org.testcontainers</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getBom() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("testcontainers.bom");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class TomcatLibraryAccessors extends SubDependencyFactory {
        private final TomcatEmbedLibraryAccessors laccForTomcatEmbedLibraryAccessors = new TomcatEmbedLibraryAccessors(owner);

        public TomcatLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>tomcat.embed</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public TomcatEmbedLibraryAccessors getEmbed() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForTomcatEmbedLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class TomcatEmbedLibraryAccessors extends SubDependencyFactory {

        public TomcatEmbedLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>org.apache.tomcat.embed:tomcat-embed-core</b> coordinates and
         * with version <b>10.1.34</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCore() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("tomcat.embed.core");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class XmlunitLibraryAccessors extends SubDependencyFactory {

        public XmlunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>org.xmlunit:xmlunit-core</b> coordinates and
         * with version <b>2.10.0</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCore() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
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

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
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
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<ExternalModuleDependencyBundle> getJackson() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
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
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<ExternalModuleDependencyBundle> getLogback() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return createBundle("logback");
        }

        /**
         * Dependency bundle provider for <b>minio</b> which contains the following dependencies:
         * <ul>
         *    <li>io.minio:minio</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<ExternalModuleDependencyBundle> getMinio() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
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
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<ExternalModuleDependencyBundle> getMockito() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
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
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<ExternalModuleDependencyBundle> getOpentelemetry() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return createBundle("opentelemetry");
        }

        /**
         * Dependency bundle provider for <b>s3aws</b> which contains the following dependencies:
         * <ul>
         *    <li>software.amazon.awssdk:s3</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<ExternalModuleDependencyBundle> getS3aws() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
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
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<ExternalModuleDependencyBundle> getTemporal() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
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
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<ExternalModuleDependencyBundle> getTestcontainers() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return createBundle("testcontainers");
        }

        /**
         * Group of bundles at <b>bundles.bllk</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public BllkBundleAccessors getBllk() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return baccForBllkBundleAccessors;
        }

        /**
         * Group of bundles at <b>bundles.okhttp3</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Okhttp3BundleAccessors getOkhttp3() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return baccForOkhttp3BundleAccessors;
        }

        /**
         * Group of bundles at <b>bundles.spring</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public SpringBundleAccessors getSpring() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return baccForSpringBundleAccessors;
        }

        /**
         * Group of bundles at <b>bundles.third</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ThirdBundleAccessors getThird() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return baccForThirdBundleAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
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
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<ExternalModuleDependencyBundle> getCommon() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return createBundle("bllk.common");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
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
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<ExternalModuleDependencyBundle> getMockwebserver() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return createBundle("okhttp3.mockwebserver");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
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
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<ExternalModuleDependencyBundle> asProvider() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return createBundle("spring");
        }

        /**
         * Group of bundles at <b>bundles.spring.openapi</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public SpringOpenapiBundleAccessors getOpenapi() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return baccForSpringOpenapiBundleAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
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
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<ExternalModuleDependencyBundle> getApp() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return createBundle("spring.openapi.app");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
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
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<ExternalModuleDependencyBundle> getParty() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
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
