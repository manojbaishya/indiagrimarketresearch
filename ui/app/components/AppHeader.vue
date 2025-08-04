<script setup lang="ts">
import { navigationMenuTriggerStyle } from '@/components/ui/navigation-menu';
import type { NavigationData } from '@/utils/navigation';
import { Icon } from '@iconify/vue'

defineProps<{ links: NavigationData }>()

const colorMode = useColorMode();
</script>

<template>
    <NavigationMenu disableHoverTrigger>
        <NavigationMenuList>
            <NavigationMenuItem v-for="page in links.pages" :key="page.meta.id">
                <div v-if="page.hasChildren">
                    <NavigationMenuTrigger>{{ page.meta.name }}
                    </NavigationMenuTrigger>
                    <NavigationMenuContent>
                        <NuxtLink v-for="link in page.children" v-slot="{ isActive, href, navigate }" :key="link.id"
                            :to="link.target" custom>
                            <NavigationMenuLink :active="isActive" :href :class="navigationMenuTriggerStyle()"
                                @click="navigate">
                                {{ link.name }}
                            </NavigationMenuLink>
                        </NuxtLink>
                    </NavigationMenuContent>
                </div>
                <div v-else>
                    <NuxtLink v-slot="{ isActive, href, navigate }" :key="page.self?.id" :to="page.self?.target" custom>
                        <NavigationMenuLink :active="isActive" :href :class="navigationMenuTriggerStyle()"
                            @click="navigate">
                            {{ page.self?.name }}
                        </NavigationMenuLink>
                    </NuxtLink>
                </div>
            </NavigationMenuItem>
        </NavigationMenuList>
    </NavigationMenu>

    <DropdownMenu>
        <DropdownMenuTrigger as-child>
            <Button variant="outline">
                <Icon icon="radix-icons:moon"
                    class="h-[1.2rem] w-[1.2rem] rotate-0 scale-100 transition-all dark:-rotate-90 dark:scale-0" />
                <Icon icon="radix-icons:sun"
                    class="absolute h-[1.2rem] w-[1.2rem] rotate-90 scale-0 transition-all dark:rotate-0 dark:scale-100" />
                <span class="sr-only">Toggle theme</span>
            </Button>
        </DropdownMenuTrigger>
        <DropdownMenuContent align="end">
            <DropdownMenuItem @click="colorMode.preference = 'light'">
                Light
            </DropdownMenuItem>
            <DropdownMenuItem @click="colorMode.preference = 'dark'">
                Dark
            </DropdownMenuItem>
            <DropdownMenuItem @click="colorMode.preference = 'system'">
                System
            </DropdownMenuItem>
        </DropdownMenuContent>
    </DropdownMenu>
</template>