/*
 * ProGuard -- shrinking, optimization, obfuscation, and preverification
 *             of Java bytecode.
 */
package proguard.annotation;

import java.lang.annotation.*;

/**
 * This annotation specifies to keep all public getters and setters of the
 * annotated class from being shrunk, optimized, or obfuscated as entry points.
 *
 * @author Eric Lafortune
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.CLASS)
@Documented
public @interface KeepPublicGettersSetters {}
