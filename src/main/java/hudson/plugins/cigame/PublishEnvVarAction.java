package hudson.plugins.cigame;

import hudson.model.InvisibleAction;
import hudson.model.EnvironmentContributingAction;
import hudson.model.AbstractBuild;
import hudson.EnvVars;

/**
 * An action to publish a single environment variable.
 * This code was copied from https://groups.google.com/forum/#!topic/jenkinsci-dev/TLUKZKOwJSQ
 */
public class PublishEnvVarAction extends InvisibleAction implements EnvironmentContributingAction {

    /** The environment variable key. */
    private String key;

    /** The environment variable value. */
    private String value;

    /**
     * Constructor.
     * @param key the environment variable key
     * @param value the environment variable value
     */
    public PublishEnvVarAction(String key, String value) {
        this.key = key;
        this.value = value;
    }

    /* (non-Javadoc)
     * @see hudson.model.EnvironmentContributingAction#buildEnvVars(hudson.model.AbstractBuild, hudson.EnvVars)
     */
    public void buildEnvVars(AbstractBuild<?, ?> build, EnvVars env) {
        env.put(key, value);
    }

}