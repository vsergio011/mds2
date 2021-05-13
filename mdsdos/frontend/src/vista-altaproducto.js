import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-altaproducto`
 *
 * VistaAltaproducto element.
 *
 * @customElement
 * @polymer
 */
class VistaAltaproducto extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-altaproducto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAltaproducto.is, VistaAltaproducto);
